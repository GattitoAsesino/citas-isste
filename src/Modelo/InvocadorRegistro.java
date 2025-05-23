/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Comando;

/**
 *
 * @author sherl
 */
public class InvocadorRegistro {
    private Comando command;

    public void setCommand(Comando command) {
        this.command = command;
    }

    public void ejecutarRegistro() {
        if (command != null) {
            command.ejecutar();
        }
    }
}
