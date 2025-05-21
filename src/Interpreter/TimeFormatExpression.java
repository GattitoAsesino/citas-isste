/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author crist
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeFormatExpression implements Expression {
    private final String format;
    
    public TimeFormatExpression(String format) {
        this.format = format;
    }
    
    @Override
    public boolean interpret(String context) {
        try {
            LocalTime time = LocalTime.parse(context, DateTimeFormatter.ofPattern(format));
            // Validar que esté en horario laboral (8am-8pm)
            return !time.isBefore(LocalTime.of(8, 0)) && 
                   !time.isAfter(LocalTime.of(20, 0));
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
