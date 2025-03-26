/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author sherl
 */
public class Medico implements ComponenteHospital {
    private int id;
    private String nombre;
    private String especialidad;
    private String correo;
    public Medico(int id, String nombre, String especialidad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.correo=correo;
    }
    
    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Médico: " + nombre + " - Especialidad: " + especialidad);
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
