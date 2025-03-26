/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

<<<<<<< HEAD
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sherl
 */
public class Usuario implements ComponenteHospital {
    private String  rfc, curp, correo, contraseña, nombre, apellidoMaterno, apellidoPaterno, tipo;
    private int id;
    
    public Usuario(String rfc, String curp, String correo, String contraseña, String nombre, String apellidoMaterno, String apellidoPaterno) {
        this.rfc = rfc;
        this.curp = curp;
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
    }
    
=======
/**
 *
 * @author crist
 */
public class Usuario {
    private String  rfc, curp, correo, contraseña, nombre, apellidoMaterno, apellidoPaterno, tipo;
    private int id;
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
<<<<<<< HEAD
    
=======

    public Usuario(String rfc, String curp, String correo, String contraseña, String nombre, String apellidoMaterno, String apellidoPaterno) {
        this.rfc = rfc;
        this.curp = curp;
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
    }

>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    public String getTipo() {
        return tipo;
    }

    public String getRfc() {
        return rfc;
    }

    public String getCurp() {
        return curp;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
<<<<<<< HEAD
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + " " + apellidoPaterno + " - RFC: " + rfc);
    }

    @Override
    public void agregar(ComponenteHospital componente) {
        throw new UnsupportedOperationException("No aplicable para usuarios individuales");
    }

    @Override
    public void eliminar(ComponenteHospital componente) {
        throw new UnsupportedOperationException("No aplicable para usuarios individuales");
    }

    @Override
    public List<ComponenteHospital> getSubordinados() {
        return Collections.emptyList(); // No tiene subordinados
    }
}
=======
}
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
