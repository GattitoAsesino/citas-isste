/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_Doctor;

public class EstadoReservada implements EstadoCita {
    @Override
    public void mostrarEstado(javax.swing.JComboBox<String> horaBox, String hora) {
        horaBox.addItem("🔴 Reservada - " + hora);
    }
}