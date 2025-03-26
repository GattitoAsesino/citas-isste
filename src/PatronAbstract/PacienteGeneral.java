/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAbstract;

/**
 *
 * @author crist
 */
public class PacienteGeneral implements Paciente {
    @Override
    public void solicitarCita() {
        System.out.println("Paciente general solicitando cita...");
    }
}