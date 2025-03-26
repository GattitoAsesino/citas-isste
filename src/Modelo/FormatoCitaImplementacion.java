package Modelo;

import javax.swing.*;
import java.sql.*;

public interface FormatoCitaImplementacion {
    void obtenerDatosSucursales(Connection conn, JComboBox<String> sucursalComboBox);
    int devolverIDM(Connection conn, String nombre);
    void obtenerDatosMedicos(Connection conn, JComboBox<String> medicoComboBox, int sucursal, String tipo);
    void obtenerFechasDisponibles(Connection conn, JComboBox<String> fechaComboBox, int idMedico);
    void obtenerHorasDisponibles(Connection conn, JComboBox<String> horaComboBox, String fecha, int idMedico);
    String devolverConsultorio(Connection conn, String id);
    void cambiarEstadoCita(Connection conn, int idCita, int idAfiliado, String nombreAfiliado, String fechaAgendada, 
                           String horaAgendada, String doctorAsignado, String fechaCita, String horaCita, 
                           String consultorio, String tipo, int idMedico);
    int obtenerIdCita(Connection conn, int idDoctor, String fecha, String hora);
}
