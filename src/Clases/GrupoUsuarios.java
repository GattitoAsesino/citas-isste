/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Modelo.RegistrarUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sherl
 */


public class GrupoUsuarios {
    private List<Usuario> usuarios;
    private Connection conn; // Conexión a la base de datos

    // Constructor
    public GrupoUsuarios(Connection conn) {
        this.usuarios = new ArrayList<>();
        this.conn = conn;
    }

    // Agregar usuario al grupo
    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    // Eliminar usuario del grupo
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // Registrar todos los usuarios del grupo
    public boolean registrarUsuarios() {
        if (usuarios.isEmpty()) {
            return false;
        }

        try {
            for (Usuario usuario : usuarios) {
                RegistrarUsuario.registrar(conn, usuario);
            }
            usuarios.clear(); // Limpiar la lista después de registrar
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Obtener la lista de usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Verificar si el grupo está vacío
    public boolean estaVacio() {
        return usuarios.isEmpty();
    }
}

