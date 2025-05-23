/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
import Conexion.Conexion;
import Vista.Vista_Principal;
import java.sql.Connection;

/**
 *
 * @author crist
 */
public class App {
    public static void main ( String args[] ){
        Conexion conexionBD = Conexion.getInstance();
        Connection conexion = conexionBD.getConexion();
        Vista_Principal nuevaVista = new Vista_Principal(conexion);
        nuevaVista.setVisible(true);
    }
}
