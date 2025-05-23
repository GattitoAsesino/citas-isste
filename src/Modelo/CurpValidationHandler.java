package Modelo;

import javax.swing.JOptionPane;
import Clases.Usuario;
import Vista.ValidacionHandler;
import java.util.regex.Pattern;

public class CurpValidationHandler implements ValidacionHandler {
    private ValidacionHandler nextHandler;
    private static final Pattern CURP_PATTERN = 
        Pattern.compile("^[A-Z]{4}[0-9]{6}[HM][A-Z]{5}[A-Z0-9]{2}$");

    @Override
    public ValidacionHandler setNextHandler(ValidacionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    @Override
    public boolean validar(Usuario usuario) {
        System.out.println("[DEBUG] Validando CURP: " + usuario.getCurp()); // Debug
        
        if (usuario.getCurp() == null || usuario.getCurp().trim().isEmpty()) {
            showError("La CURP no puede estar vacía");
            return false;
        }

        String curp = usuario.getCurp().toUpperCase().trim();

        // Validación básica
        if (curp.length() != 18) {
            showError("La CURP debe tener exactamente 18 caracteres");
            return false;
        }

        // Validación de estructura
        if (!CURP_PATTERN.matcher(curp).matches()) {
            showError("Formato de CURP inválido\nEjemplo válido: GODE561231MDFLRN09");
            return false;
        }

        // Validación de fecha
        if (!isValidDate(curp.substring(4, 10))) {
            showError("Fecha en CURP inválida (AAMMDD)");
            return false;
        }

        // Validación de sexo
        char sexo = curp.charAt(10);
        if (sexo != 'H' && sexo != 'M') {
            showError("Sexo debe ser H (Hombre) o M (Mujer)");
            return false;
        }

        // Pasar al siguiente validador
        return nextHandler == null || nextHandler.validar(usuario);
    }

    private boolean isValidDate(String dateStr) {
        try {
            int year = Integer.parseInt(dateStr.substring(0, 2));
            int month = Integer.parseInt(dateStr.substring(2, 4));
            int day = Integer.parseInt(dateStr.substring(4, 6));

            if (month < 1 || month > 12) return false;
            if (day < 1 || day > 31) return false;

            // Validar meses con 30 días
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, 
            "Error en CURP:\n" + message, 
            "Error de Validación", 
            JOptionPane.ERROR_MESSAGE);
    }
}