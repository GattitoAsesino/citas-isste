/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author gerry
 */
import Clases.Usuario; 
public interface Autenticacion {
     Usuario autenticar(String credencial1, String credencial2);
}
