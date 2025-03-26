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

public class SesionSQL implements Autenticacion {
    private Connection conn;

    // Constructor
    public SesionSQL(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Usuario autenticar(String correo, String contraseña) {
        String sqlUsuario = "SELECT * FROM usuarios WHERE correo = '" + correo + "' AND contraseña = '" + contraseña + "'";

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
                Usuario usuario = new Usuario(rfc, curp, correo, contraseña, nombre, aM, aP);
                usuario.setTipo(tipo);
                usuario.setId(id);
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}