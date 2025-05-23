/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sherl
 */
public class RegistroUsuarioProxy implements IRegistroUsuario {
    private IRegistroUsuario registroReal;

    public RegistroUsuarioProxy(IRegistroUsuario registroReal) {
        this.registroReal = registroReal;
    }

    @Override
    public boolean registrar(Usuario usuario) throws SQLException {
        
        if (!usuario.getCorreo().endsWith("@issste.gob.mx")) {
            JOptionPane.showMessageDialog(null, "El correo debe ser institucional (\"@issste.gob.mx\")");
            return false;
        }

        return registroReal.registrar(usuario);
    }
}
