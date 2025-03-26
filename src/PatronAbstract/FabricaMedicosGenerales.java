/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronAbstract;

/**
 *
 * @author crist
 */
public class FabricaMedicosGenerales implements FabricaAbstracta {
    @Override
    public Medico crearMedico() {
        return new MedicoGeneral();
    }

    @Override
    public Paciente crearPaciente() {
        return new PacienteGeneral();
    }

    @Override
    public Cita crearCita() {
        return new CitaGeneral();
    }
}

