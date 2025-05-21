/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

import java.util.regex.Pattern;

public class DocumentExpression implements Expression {
    private final DocumentType type;
    
    public DocumentExpression(DocumentType type) {
        this.type = type;
    }
    
    @Override
    public boolean interpret(String context) {
        switch(type) {
            case CURP:
                return Pattern.matches("[A-Z]{4}[0-9]{6}[A-Z]{6}[0-9A-Z]{2}", context);
            case RFC:
                return Pattern.matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}", context);
            default:
                return false;
        }
    }
    
    public enum DocumentType { CURP, RFC }
}
