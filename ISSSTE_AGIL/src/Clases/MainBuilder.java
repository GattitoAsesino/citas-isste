package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author li
 */
public class MainBuilder {
    public static void main(String[] args) {
        // Usar el Builder directamente
        Cita cita = new CitaBuilder()
                        .setId(688)
                        .setIdPaciente(61)
                        .setIdMedico(11)
                        .setFecha("2024-06-03")
                        .setHora("07:00:00")
                        .setConsultorio("1")
                        .setTipo("General")
                        .setDisponible(false)
                        .build();

        System.out.println(cita);
    }
}