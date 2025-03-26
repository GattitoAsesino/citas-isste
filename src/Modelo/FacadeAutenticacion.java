/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author li
 */
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FacadeAutenticacion {

    // Método para iniciar sesión
    public static Usuario iniciarSesion(Connection conn, String correo, String contraseña) {
        String sqlUsuario = "SELECT * FROM usuarios WHERE correo = ? AND contraseña = ?";

        try (PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario)) {
            stmtUsuario.setString(1, correo);
            stmtUsuario.setString(2, contraseña);

            try (ResultSet rs = stmtUsuario.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String aP = rs.getString("apellido_p");
                    String aM = rs.getString("apellido_m");
                    String rfc = rs.getString("rfc");
                    String curp = rs.getString("curp");
                    String tipo = rs.getString("tipo");

                    Usuario usuario = new Usuario(rfc, curp, correo, contraseña, nombre, aM, aP);
                    usuario.setTipo(tipo);
                    usuario.setId(id);

                    System.out.println("Usuario encontrado: " + usuario.getCurp());
                    return usuario;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    // Método para registrar un nuevo usuario
    public static boolean registrar(Connection conn, Usuario usuario) {
        try {
            // Verificar si el CURP, RFC o correo ya están registrados
            if (existeRegistro(conn, "curp", usuario.getCurp())) {
                JOptionPane.showMessageDialog(null, "La CURP ya ha sido registrada en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if (existeRegistro(conn, "rfc", usuario.getRfc())) {
                JOptionPane.showMessageDialog(null, "El RFC ya ha sido registrado en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if (existeRegistro(conn, "correo", usuario.getCorreo())) {
                JOptionPane.showMessageDialog(null, "El correo ya ha sido registrado en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else {
                // Insertar el nuevo usuario
                String sql = "INSERT INTO usuarios (rfc, curp, correo, contraseña, nombre, apellido_p, apellido_m, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, usuario.getRfc());
                    stmt.setString(2, usuario.getCurp());
                    stmt.setString(3, usuario.getCorreo());
                    stmt.setString(4, usuario.getContraseña());
                    stmt.setString(5, usuario.getNombre());
                    stmt.setString(6, usuario.getApellidoPaterno());
                    stmt.setString(7, usuario.getApellidoMaterno());
                    stmt.setString(8, "usuario"); // Tipo de usuario por defecto

                    int filasInsertadas = stmt.executeUpdate();
                    if (filasInsertadas > 0) {
                        JOptionPane.showMessageDialog(null, "Registro realizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas al realizar el registro", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return false;
    }

    // Método auxiliar para verificar si un campo ya está registrado
    private static boolean existeRegistro(Connection conn, String campo, String valor) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE " + campo + " = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, valor);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // Retorna true si existe un registro con ese valor
            }
        }
    }
}
