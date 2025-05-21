/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author crist
 */

public class ValidadorInformesMedicos {
    public static boolean validarInformeCompleto(String diagnostico, String tratamiento) {
        Expression diagnosticoValido = new DiagnosticoExpression();
        Expression tratamientoValido = new TratamientoExpression();
        
        Expression informeValido = new AndExpression(diagnosticoValido, tratamientoValido);
        
        return informeValido.interpret(diagnostico + "||" + tratamiento);
    }
}
