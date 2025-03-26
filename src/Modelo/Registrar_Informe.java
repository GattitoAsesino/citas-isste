/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 
import javax.swing.JOptionPane;
/**
 *
 * @author crist
 */
public class Registrar_Informe {

    public static void llenarComboBoxFechas(Connection conn, JComboBox comboBox, int idMedico) {
        comboBox.removeAllItems(); // Limpiar el combo box antes de llenarlo de nuevo
        
        String sql = "SELECT DISTINCT fecha_cita FROM citas_afiliado WHERE id_medico = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMedico);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                comboBox.addItem(rs.getString("fecha_cita"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo adecuado de la excepción
        }
    }
    public static void llenarComboBoxHoras(Connection conn, JComboBox comboBox, int idMedico, String fecha) {
        comboBox.removeAllItems(); // Limpiar el combo box antes de llenarlo de nuevo
        
        String sql = "SELECT DISTINCT hora_cita FROM citas_afiliado WHERE id_medico = ? and fecha_cita = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMedico);
            stmt.setString(2, fecha);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                comboBox.addItem(rs.getString("hora_cita"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo adecuado de la excepción
        }
    }

    public static int getIdMedico(Connection conn, String correo) {
        int idMedico = -1; // Valor por defecto si no se encuentra el médico
        
        String sql = "SELECT id FROM Especialistas WHERE correo = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                idMedico = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo adecuado de la excepción
        }
        
        return idMedico;
    }
    public static int getIdMedico2(Connection conn, String correo) {
        int idMedico = -1; // Valor por defecto si no se encuentra el médico
        
        String sql = "SELECT id FROM usuarios WHERE correo = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                idMedico = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo adecuado de la excepción
        }
        
        return idMedico;
    }
    
    public static Map<Integer, String> rellenarComboBoxPacientesPorFechaYMedico(Connection conn, String fecha, int idMedico, JComboBox<String> comboBox) {
        comboBox.removeAllItems(); // Limpiar el ComboBox
        Map<Integer, String> pacientesMap = new HashMap<>(); // Mapa para almacenar el ID y el nombre completo del paciente
    
        String sql = "SELECT id_paciente, nombre_paciente FROM citas_afiliado WHERE fecha_cita = ? AND id_medico = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fecha);
            stmt.setInt(2, idMedico);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int idPaciente = rs.getInt("id_paciente");
                String nombrePaciente = rs.getString("nombre_paciente");
                
                String apellidoP = obtenerApellidoPaciente(conn, idPaciente);
                String apellidoM = obtenerApellidoMaternoPaciente(conn, idPaciente);
                
                String nombreCompleto = nombrePaciente + " " + apellidoP + " " + apellidoM;
                
                comboBox.addItem(nombreCompleto);
                pacientesMap.put(idPaciente, nombreCompleto); // Almacenar el ID del paciente y su nombre completo en el mapa
            }
            for (Map.Entry<Integer, String> entry : pacientesMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo adecuado de la excepciÃ³n
        }
        return pacientesMap;
    }

    
    public static String obtenerApellidoPaciente(Connection conn, int idPaciente) throws SQLException {
        String apellidoP = "";
        String sql = "SELECT apellido_p FROM Usuarios WHERE id = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                apellidoP = rs.getString("apellido_p");
            }
        }
        
        return apellidoP;
    }
    
    public static String obtenerNombre(Connection conn, String fecha, String hora, int idMedico) throws SQLException {
        String nombre = "";
        String sql = "SELECT nombre_paciente FROM Citas_Afiliado WHERE fecha_cita = ? and hora_cita = ? and id_Medico = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fecha);
            stmt.setString(2,hora);
            stmt.setInt (3,idMedico);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                nombre = rs.getString("nombre_paciente");
            }
        }
        
        return nombre;
    }
    
    public static String obtenerApellidoMaternoPaciente(Connection conn, int idPaciente) throws SQLException {
        String apellidoM = "";
        String sql = "SELECT apellido_m FROM Usuarios WHERE id = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                apellidoM = rs.getString("apellido_m");
            }
        }
        
        return apellidoM;
    }
    public static void insertarInformeMedico(Connection conn, int id_paciente, int id_medico, String fecha, String altura, String peso, String temperatura, String alergias, String diagnostico, String tratamiento, String nombre_paciente, String nombre_medico, String edad, String motivo) {
        String sqlConsulta = "SELECT COUNT(*) FROM InformesMedicos WHERE fecha = ? AND id_medico = ? AND id_paciente = ?";
        String sqlInsercion = "INSERT INTO InformesMedicos (id_paciente, id_medico, fecha, altura, peso, temperatura, alergias, Diagnostico, tratamiento, nombre_paciente, nombre_medico, edad, motivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Verificar si ya existe un informe médico con la misma fecha, id de médico e id de paciente
            PreparedStatement consultaStatement = conn.prepareStatement(sqlConsulta);
            consultaStatement.setString(1, fecha);
            consultaStatement.setInt(2, id_medico);
            consultaStatement.setInt(3, id_paciente);
            ResultSet resultadoConsulta = consultaStatement.executeQuery();
            resultadoConsulta.next(); // Mover el cursor al primer resultado
            int cantidadInformes = resultadoConsulta.getInt(1);

            if (cantidadInformes > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un informe médico con la misma fecha, médico y paciente. No se puede realizar la inserción.");
                return; // Salir del método si ya existe un informe médico con los mismos datos
            }

            // Si no existe un informe médico con los mismos datos, realizar la inserción
            PreparedStatement insercionStatement = conn.prepareStatement(sqlInsercion);
            insercionStatement.setInt(1, id_paciente);
            insercionStatement.setInt(2, id_medico);
            insercionStatement.setString(3, fecha);
            insercionStatement.setString(4, altura);
            insercionStatement.setString(5, peso);
            insercionStatement.setString(6, temperatura);
            insercionStatement.setString(7, alergias);
            insercionStatement.setString(8, diagnostico);
            insercionStatement.setString(9, tratamiento);
            insercionStatement.setString(10, nombre_paciente);
            insercionStatement.setString(11, nombre_medico);
            insercionStatement.setString(12, edad);
            insercionStatement.setString(13, motivo);

            insercionStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informe médico insertado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el informe médico: " + e.getMessage());
        }
    }

    
    public static int obtenerIdPaciente(Connection conn, String nombreCompleto, String fechaCita) {
        int idPaciente = -1;
        String sql = "SELECT id_paciente FROM Citas_Afiliado WHERE nombre_paciente = ? AND fecha_cita = ?";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nombreCompleto);
            statement.setString(2, fechaCita);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                idPaciente = resultSet.getInt("id_paciente");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el ID del paciente: " + e.getMessage());
        }

        return idPaciente;
    }
    
    public static int encontrarIdPorNombre(Map<Integer, String> mapa, String nombreBuscado) {
    for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
        if (entry.getValue().equals(nombreBuscado)) {
            return entry.getKey(); // Devuelve el ID si encuentra el nombre
        }
    }
    return -1; // Devuelve -1 si no encuentra el nombre
    }
}
