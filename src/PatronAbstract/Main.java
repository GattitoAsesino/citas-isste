/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAbstract;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de médicos generales
        FabricaAbstracta fabricaMedicosGenerales = new FabricaMedicosGenerales();
        Medico medicoGeneral = fabricaMedicosGenerales.crearMedico();
        Paciente pacienteGeneral = fabricaMedicosGenerales.crearPaciente();
        Cita citaGeneral = fabricaMedicosGenerales.crearCita();

        medicoGeneral.atenderPaciente();
        pacienteGeneral.solicitarCita();
        citaGeneral.programar();

        // Crear una fábrica de dentistas
        FabricaAbstracta fabricaDentistas = new FabricaDentistas();
        Medico dentista = fabricaDentistas.crearMedico();
        Paciente pacienteDental = fabricaDentistas.crearPaciente();
        Cita citaDentista = fabricaDentistas.crearCita();

        dentista.atenderPaciente();
        pacienteDental.solicitarCita();
        citaDentista.programar();
    }
}