/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author crist
 */
public class RegistrarUsuario {
    public static boolean registrar(Connection conn, Usuario usuario) throws SQLException{
        try{
            String sql1 = "SELECT * FROM usuarios WHERE curp = '"+ usuario.getCurp()+"'" ;
            String sql2 = "SELECT * FROM usuarios WHERE rfc = '" + usuario.getRfc()+"'";
            String sql3 = "SELECT * FROM usuarios WHERE correo = '" + usuario.getCorreo()+"'";
            Statement st = conn.createStatement();
            Statement st1 = conn.createStatement();
            Statement st2 = conn.createStatement();
            ResultSet rs1 = st.executeQuery(sql1);
            ResultSet rs2 = st1.executeQuery(sql2);
            ResultSet rs3 = st2.executeQuery(sql3);
            if (rs1.next()){
                JOptionPane.showMessageDialog(null, "Problemas al realizar el regsitro, la curp ya ha sido registrada en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if(rs2.next()){
                JOptionPane.showMessageDialog(null, "Problemas al realizar el regsitro, el rfc ya ha sido registrado en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if(rs3.next()){
                JOptionPane.showMessageDialog(null, "Problemas al realizar el regsitro, el correo ya ha sido registrado en otro usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            }else{
                String sql4 = "INSERT INTO Usuarios (rfc, curp, correo, contraseña, nombre, apellido_p, apellido_m, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                // Preparar la sentencia
                try (PreparedStatement stmt = conn.prepareStatement(sql4)) {
                    // Establecer los parámetros de la sentencia con los valores del objeto Usuario
                    stmt.setString(1, usuario.getRfc());
                    stmt.setString(2, usuario.getCurp());
                    stmt.setString(3, usuario.getCorreo());
                    stmt.setString(4, usuario.getContraseña());
                    stmt.setString(5, usuario.getNombre());
                    stmt.setString(6, usuario.getApellidoPaterno());
                    stmt.setString(7, usuario.getApellidoMaterno());
                    stmt.setString(8, "usuario"); 
                    

                    // Ejecutar la sentencia
                    int filasInsertadas = stmt.executeUpdate();
                    if (filasInsertadas > 0) {
                        JOptionPane.showMessageDialog(null,"Registro realizado correctamente");
                        return true;
                    }
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas al realizar el regsitro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    } 
}
