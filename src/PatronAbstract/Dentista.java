/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAbstract;

/**
 *
 * @author crist
 */
public class Dentista implements Medico {
    @Override
    public void atenderPaciente() {
        System.out.println("Dentista atendiendo paciente...");
    }
}
