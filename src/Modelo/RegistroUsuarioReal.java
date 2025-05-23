/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sherl
 */
public class RegistroUsuarioReal implements IRegistroUsuario {
    private Connection conn;

    public RegistroUsuarioReal(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean registrar(Usuario usuario) throws SQLException {
        return RegistrarUsuario.registrar(conn, usuario);
    }
}

