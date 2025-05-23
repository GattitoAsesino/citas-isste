/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Usuario;

public class AutenticacionGoogle implements Autenticacion {
    @Override
    public Usuario autenticar(String token, String dummy) {
        // Lógica para autenticar con Google
        if (token.startsWith("google_")) {
            // Simulamos un usuario autenticado con Google
            return new Usuario("RFC_GOOGLE", "CURP_GOOGLE", "correo@google.com", "password", "Nombre Google", "ApellidoM", "ApellidoP");
        }
        return null;
    }
}