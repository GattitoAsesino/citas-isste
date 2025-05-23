/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Comando;
import Clases.Usuario;
import java.sql.SQLException;

/**
 *
 * @author sherl
 */
public class RegistrarUsuarioComando implements Comando {
    private Usuario usuario;
    private IRegistroUsuario registro;

    public RegistrarUsuarioComando(Usuario usuario, IRegistroUsuario registro) {
        this.usuario = usuario;
        this.registro = registro;
    }

    @Override
    public void ejecutar() {
        try {
            boolean exito = registro.registrar(usuario);
        } catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
        }
    }
}
