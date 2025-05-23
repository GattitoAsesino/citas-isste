package Vista;

import javax.swing.JOptionPane;
import Clases.Usuario;
import java.util.regex.Pattern;

public class RfcValidationHandler implements ValidacionHandler {
    private ValidacionHandler nextHandler;
    private static final Pattern RFC_PATTERN = 
        Pattern.compile("^[A-Z]{4}[0-9]{6}[A-Z0-9]{3}$");

    @Override
    public ValidacionHandler setNextHandler(ValidacionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    @Override
    public boolean validar(Usuario usuario) {
        System.out.println("[DEBUG] Validando RFC: " + usuario.getRfc()); // Debug
        
        if (usuario.getRfc() == null || usuario.getRfc().trim().isEmpty()) {
            showError("El RFC no puede estar vacío");
            return false;
        }

        String rfc = usuario.getRfc().toUpperCase().trim();

        // Validación básica
        if (rfc.length() != 13) {
            showError("El RFC debe tener exactamente 13 caracteres");
            return false;
        }

        // Validación de estructura
        if (!RFC_PATTERN.matcher(rfc).matches()) {
            showError("Formato de RFC inválido\nEjemplo válido: GODE561231ABC");
            return false;
        }

        // Validación de fecha
        if (!isValidDate(rfc.substring(4, 10))) {
            showError("Fecha en RFC inválida (AAMMDD)");
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
            "Error en RFC:\n" + message, 
            "Error de Validación", 
            JOptionPane.ERROR_MESSAGE);
    }
}