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
<<<<<<< HEAD
    String contrasenia = "2000";
    String bd = "ISSSTE_AGIL";
=======
    String contrasenia = "issste";
    String bd = "issste";
>>>>>>> 6118f81ec0f4b599572035f386ef92f2ab5b4abe
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
    
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