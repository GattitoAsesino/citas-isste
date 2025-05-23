/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import Clases.Usuario;
import Clases.Medico;

public class PersonaFactory {

    public static Object crearPersona(String tipo, String[] datos) {
        switch (tipo.toLowerCase()) {
            case "usuario":
                return new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
            case "medico":
                return new Medico(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3]);
            default:
                throw new IllegalArgumentException("Tipo de persona no válido: " + tipo);
        }
    }
}