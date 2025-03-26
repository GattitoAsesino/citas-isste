/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Usuario;

public class AutenticacionAdapter implements Autenticacion {
    private Autenticacion autenticacion;

    public AutenticacionAdapter(Autenticacion autenticacion) {
        this.autenticacion = autenticacion;
    }

    @Override
    public Usuario autenticar(String credencial1, String credencial2) {
        return autenticacion.autenticar(credencial1, credencial2);
    }
}
