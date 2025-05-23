/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_Doctor;

public class CitaContexto {
    private EstadoCita estado;

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public void mostrar(javax.swing.JComboBox<String> horaBox, String hora) {
        estado.mostrarEstado(horaBox, hora);
    }
}
