/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisandro Cristobal Ramirez
 */
public class Conexion {
    Connection conectar;
    String usuario = "root";
<<<<<<< HEAD
    String contrasenia = "12345";
    String bd = "issste";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd+"?serverTimezone=America/Mexico_City";
=======
    String contrasenia = "issste";
    String bd = "issste";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
>>>>>>> 6118f81ec0f4b599572035f386ef92f2ab5b4abe
    
    public Connection estableceConexion(){
        try{
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas en la conexion"+e.toString());
        }
        return conectar;
    }
}