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
        Conexion cx = new Conexion();
        Connection conn = cx.estableceConexion();
        Vista_Principal nuevaVista = new Vista_Principal(conn);
        nuevaVista.setVisible(true);
    }
}
