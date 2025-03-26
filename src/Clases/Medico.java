/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
<<<<<<< HEAD
public class Medico implements Cloneable {
=======

public class Medico {
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    private int id;
    private String nombre;
    private String especialidad;
    private String correo;
<<<<<<< HEAD

=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    public Medico(int id, String nombre, String especialidad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
<<<<<<< HEAD
        this.correo = correo;
=======
        this.correo=correo;
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
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

<<<<<<< HEAD
    // Implementación del patrón Prototype
    @Override
    public Medico clone() {
        try {
            return (Medico) super.clone(); // Clonación superficial
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar Medico", e);
        }
    }

=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
<<<<<<< HEAD


=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
