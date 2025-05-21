/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author crist
 */

import java.util.Arrays;
import java.util.List;

public class TratamientoExpression implements Expression {
    
    // Lista de tratamientos válidos (podría venir de BD)
    private static final List<String> TRATAMIENTOS_VALIDOS = Arrays.asList(
        "Reposo", "Medicación", "Cirugía", "Terapia", 
        "Fisioterapia", "Control", "Hospitalización"
    );
    
    @Override
    public boolean interpret(String context) {
        // Validación 1: No vacío
        if(context == null || context.trim().isEmpty()) {
            return false;
        }
        
        // Validación 2: Contiene al menos un tratamiento válido
        return TRATAMIENTOS_VALIDOS.stream()
            .anyMatch(tratamiento -> context.contains(tratamiento));
    }
}