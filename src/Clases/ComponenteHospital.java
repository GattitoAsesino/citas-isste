/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author sherl
 */
public interface ComponenteHospital {
    void mostrarInformacion();
    void agregar(ComponenteHospital componente); // Solo para composites
    void eliminar(ComponenteHospital componente); // Solo para composites
    List<ComponenteHospital> getSubordinados(); // Solo para composites
}