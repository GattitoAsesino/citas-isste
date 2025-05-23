/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import Clases.Usuario;
import java.sql.SQLException;

/**
 *
 * @author sherl
 */
public interface IRegistroUsuario {
    boolean registrar(Usuario usuario) throws SQLException;
}

