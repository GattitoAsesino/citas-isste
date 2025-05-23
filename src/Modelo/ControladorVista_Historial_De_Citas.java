/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class ControladorVista_Historial_De_Citas {
    public static void mostrarDatos(Connection conn, JTable tabla,int id){

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cita");
        modelo.addColumn("nombre_paciente");
        modelo.addColumn("fecha_agendada");
        modelo.addColumn("hora_agendada");
        modelo.addColumn("doctor_asignado");
        modelo.addColumn("fecha_cita");
        modelo.addColumn("hora_cita");
        modelo.addColumn("Consultorio");
        modelo.addColumn("Tipo");
        tabla.setModel(modelo);
        String sql="SELECT * FROM citas_afiliado WHERE id_paciente = "+id;
        String []datos = new String [9];
        try{
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(3);     
                datos[2]=rs.getString(4);   
                datos[3]=rs.getString(5);   
                datos[4]=rs.getString(6);   
                datos[5]=rs.getString(7);   
                datos[6]=rs.getString(8);  
                datos[7]=rs.getString(9); 
                datos[8]=rs.getString(10);  
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);

        }   catch (SQLException ex) {
                Logger.getLogger(ControladorVista_Historial_De_Citas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    public static boolean ultimaCitaYaPaso(Connection conn, String tipoEspecialista, String id) {
        boolean citaYaPaso = true;
        String sql = "SELECT fecha_cita, hora_cita FROM citas_afiliado WHERE tipo = '" + tipoEspecialista + "' and id_paciente = "+id+" "+
                     " ORDER BY fecha_cita DESC, hora_cita DESC LIMIT 1 ";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                // Obtener la fecha y hora de la última cita
                LocalDate fechaCita = rs.getDate("fecha_cita").toLocalDate();
                LocalTime horaCita = rs.getTime("hora_cita").toLocalTime();

                // Obtener la fecha y hora actual
                LocalDateTime ahora = LocalDateTime.now();
                LocalDate fechaActual = ahora.toLocalDate();
                LocalTime horaActual = ahora.toLocalTime();

                // Comparar la fecha y hora de la última cita con la fecha y hora actual
                if (fechaCita.isAfter(fechaActual) || (fechaCita.equals(fechaActual) && horaCita.isAfter(horaActual))) {
                    citaYaPaso = false;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return citaYaPaso;
    }

}
