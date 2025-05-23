/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisandro Cristobal Ramirez
 */
public class Conexion {
    // Atributo estático que guarda la única instancia
    private static Conexion instancia;
    private Connection conexion;

    // Constructor privado para evitar instanciación externa
    private Conexion() {
        try {
            // Parámetros de conexión (ajustar según tu configuración)
            String url = "jdbc:mysql://localhost:3306/ISSSTE_AGIL";
            String usuario = "root";
            String contraseña = "2000";

            // Crear la conexión
            this.conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la BD: " + e.getMessage());
        }
    }

    // Método estático para obtener la instancia única
    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return conexion;
    }

    // Método para cerrar la conexión (opcional)
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}