/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaUsuario;

/**
 *
 * @author gerry
 */
public class Memento {
    private final String fecha;
    private final String hora;
    private final String nomDoc;
    private final String tipo1;
    private final String consultorio;
    private final int idMedico;

    /**
     * Constructor de la clase Memento.
     * @param fecha La fecha de la cita.
     * @param hora La hora de la cita.
     * @param nomDoc El nombre del doctor.
     * @param tipo1 El tipo de cita.
     * @param consultorio El consultorio.
     * @param idMedico El ID del médico.
     */
    public Memento(String fecha, String hora, String nomDoc, String tipo1, String consultorio, int idMedico) {
        this.fecha = fecha;
        this.hora = hora;
        this.nomDoc = nomDoc;
        this.tipo1 = tipo1;
        this.consultorio = consultorio;
        this.idMedico = idMedico;
    }

    // Getters para acceder a los atributos del estado guardado
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getNomDoc() {
        return nomDoc;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public int getIdMedico() {
        return idMedico;
    }
}
