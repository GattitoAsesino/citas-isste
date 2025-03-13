/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class CitaBuilder {
    private Cita cita;

    public CitaBuilder() {
        this.cita = new Cita();
    }

    public CitaBuilder setId(int id) {
        cita.setId(id);
        return this;
    }

    public CitaBuilder setIdPaciente(int idPaciente) {
        cita.setIdPaciente(idPaciente);
        return this;
    }

    public CitaBuilder setIdMedico(int idMedico) {
        cita.setIdMedico(idMedico);
        return this;
    }

    public CitaBuilder setFecha(String fecha) {
        cita.setFecha(fecha);
        return this;
    }

    public CitaBuilder setHora(String hora) {
        cita.setHora(hora);
        return this;
    }

    public CitaBuilder setConsultorio(String consultorio) {
        cita.setConsultorio(consultorio);
        return this;
    }

    public CitaBuilder setTipo(String tipo) {
        cita.setTipo(tipo);
        return this;
    }

    public CitaBuilder setDisponible(boolean disponible) {
        cita.setDisponible(disponible);
        return this;
    }

    public Cita build() {
        return cita;
    }
}