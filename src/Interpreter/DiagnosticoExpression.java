/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

import java.util.regex.Pattern;

/**
 *
 * @author crist
 */
public class DiagnosticoExpression implements Expression {
    
    @Override
    public boolean interpret(String context) {
        // Validación 1: No vacío
        if(context == null || context.trim().isEmpty()) {
            return false;
        }
        
        // Validación 2: Longitud mínima/máxima
        if(context.length() < 10 || context.length() > 1000) {
            return false;
        }
        
        // Validación 3: Formato básico (debe comenzar con mayúscula y terminar con punto)
        return Pattern.matches("^[A-Z].+[.]$", context);
    }
}