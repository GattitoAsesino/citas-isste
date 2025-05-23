/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author crist
 */
public class Formato_Citas {
    // ArrayLists para almacenar los datos de la base de datos
    private static ArrayList<Integer> idSucursales = new ArrayList<>();
    private static ArrayList<Integer> idMedicos = new ArrayList<>();
    private static ArrayList<Date> fechas = new ArrayList<>();
    private static ArrayList<Time> horas = new ArrayList<>();

    // Método para obtener los datos de las sucursales desde la base de datos
    public static void obtenerDatosSucursales(Connection conn, JComboBox<String> sucursalComboBox) {
        try {
            String query = "SELECT id, entidad FROM Sucursales";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String entidad = rs.getString("entidad");
                idSucursales.add(id);
                sucursalComboBox.addItem(entidad);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int devolverIDM(Connection conn, String nombre) {
        int nombre1=-1;
    try {
            String query = "SELECT id FROM Especialistas WHERE nombre = '"+nombre+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                nombre1= rs.getInt("id");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return nombre1;
}
    
    // Método para obtener los datos de los médicos desde la base de datos
    public static void obtenerDatosMedicos(Connection conn,JComboBox<String> medicoComboBox, int Sucursal, String tipo) {
        try {
            String query = "SELECT distinct nombre FROM Especialistas WHERE especialidad = '"+tipo+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                medicoComboBox.addItem(nombre);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener las fechas disponibles desde la base de datos
    public static void obtenerFechasDisponibles(Connection conn, JComboBox<String> fechaComboBox, int idMedico) {
    try {
         System.out.println(idMedico);
        // Modificación aquí: agregamos OR para incluir todas las fechas si es emergencia
        String query = "SELECT DISTINCT fecha FROM Citas WHERE (id_medico = ? OR ? = 19) AND disponible = TRUE";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idMedico);
        // Pasamos -1 como marcador para emergencias (debe ser manejado desde la interfaz)
        stmt.setInt(2, idMedico); // Mismo parámetro, si idMedico es -1 mostrará todas
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("con");
            Date fecha = rs.getDate("fecha");
            fechaComboBox.addItem(fecha.toString());
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
}

    // Método para obtener las horas disponibles desde la base de datos
    public static void obtenerHorasDisponibles(Connection conn, JComboBox<String> horaComboBox, String fecha, int idMedico) {
    try {
         // Consulta modificada para incluir todas las horas si idMedico es -1 (emergencia)
        String query = "SELECT DISTINCT hora FROM Citas WHERE fecha = ? AND (id_medico = ? OR ? = 19) AND disponible = TRUE";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, fecha);
        stmt.setInt(2, idMedico);
        stmt.setInt(3, idMedico); // Mismo parámetro repetido para la condición OR
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Time hora = rs.getTime("hora");
            horaComboBox.addItem(hora.toString());
        }
        
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public static String devolverConsultorio(Connection conn, String id) {
        String nombre1=null;
    try {
            String query = "SELECT consultorio FROM Especialistas WHERE id = '"+id+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                nombre1= rs.getString("consultorio");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return nombre1;
}

   public static void cambiarEstadoCita(Connection conn, int idCita, int idAfiliado, String nombreAfiliado, 
                                   String fechaAgendada, String horaAgendada, String doctorAsignado, 
                                   String fechaCita, String horaCita, String consultorio, String tipo, 
                                   int idMedico) {
    try {
        boolean captura = ControladorVista_Historial_De_Citas.ultimaCitaYaPaso(conn, tipo, idAfiliado+"");
        if(captura) {
            String query;
            
            // Consulta diferente para emergencias
            if (idMedico == -1) {
                query = "UPDATE Citas SET disponible = FALSE, id_paciente = ? WHERE id = ?";
            } else {
                query = "UPDATE Citas SET disponible = FALSE, id_paciente = ? WHERE id = ? AND id_medico = ?";
            }
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, idAfiliado);
            pstmt.setInt(2, idCita);
            if (idMedico != -1) {
                pstmt.setInt(3, idMedico);
            }
            pstmt.executeUpdate();
            pstmt.close();

            // Insertar en citas_afiliado
            String insertQuery = "INSERT INTO citas_afiliado (id_cita, id_paciente, nombre_paciente, " +
                               "fecha_agendada, hora_agendada, doctor_asignado, fecha_cita, " +
                               "hora_cita, consultorio, tipo, id_medico) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setInt(1, idCita);
            insertStmt.setInt(2, idAfiliado);
            insertStmt.setString(3, nombreAfiliado);
            // ... resto de los parámetros ...
            insertStmt.setInt(11, idMedico == -1 ? null : idMedico); // Manejar nulo para emergencias
            insertStmt.executeUpdate();
            insertStmt.close();

            JOptionPane.showMessageDialog(null, "La cita ha sido agendada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Tienes una cita agendada aún, inténtalo de nuevo después de finalizar tu cita");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public static int obtenerIdCita(Connection conn, int idDoctor, String fecha, String hora) {
    int idCita = -1;
    try {
        String query = "SELECT id FROM Citas WHERE id_medico = ? AND fecha = ? AND hora = ? AND disponible = TRUE";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, idDoctor);
        pstmt.setString(2, fecha);
        pstmt.setString(3, hora);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            idCita = rs.getInt("id");
        }
        pstmt.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return idCita;
}


}
