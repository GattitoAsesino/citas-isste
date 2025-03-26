/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gatito-asesino
 */
public class FormatoCita {
    protected FormatoCitaImplementacion implementacion;

    public FormatoCita(FormatoCitaImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public void obtenerSucursales(Connection conn, JComboBox<String> sucursalComboBox) {
        implementacion.obtenerDatosSucursales(conn, sucursalComboBox);
    }

    public void obtenerMedicos(Connection conn, JComboBox<String> medicosComboBox) {
        implementacion.obtenerDatosMedicos(conn, medicosComboBox);
    }

    public void obtenerFechas(Connection conn, JComboBox<String> fechasComboBox) {
        implementacion.obtenerFechasDisponibles(conn, fechasComboBox);
    }

    public void obtenerHoras(Connection conn, JComboBox<String> horasComboBox) {
        implementacion.obtenerHorasDisponibles(conn, horasComboBox);
    }
}
