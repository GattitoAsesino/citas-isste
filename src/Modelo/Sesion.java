/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author crist
 */
public class Sesion {
    public static Usuario iniciarSesion(Connection conn, String correo, String contraseña){
            // Construir la sentencia SQL para obtener las entidades
            String sqlUsuario = "SELECT  * FROM usuarios where correo = '"+correo+"' and contraseña = '"+contraseña+"'";

            // Crear la declaración y ejecutar la consulta
            try (Statement stmtUsuario = conn.createStatement();
                 ResultSet rs = stmtUsuario.executeQuery(sqlUsuario)) {


                if (rs.next()) {
                        int id = rs.getInt("id");
                        String nombre = rs.getString("nombre");
                        String aP = rs.getString("apellido_p");
                        String aM = rs.getString("apellido_m");
                        String rfc = rs.getString("rfc");
                        String curp = rs.getString("curp");
                        String tipo = rs.getString("tipo");
                        Usuario usuario = new Usuario(rfc,curp,correo,contraseña,nombre,aM,aP);
                        usuario.setTipo(tipo);
                        usuario.setId(id);
                        System.out.println(usuario.getCurp());
                        return usuario;
                }
            } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de la excepción en tu aplicación
        }
        return null;
    }
}
