package Vista;

import javax.swing.JOptionPane;
import Clases.Usuario;
import java.util.regex.Pattern;

public class PasswordValidationHandler implements ValidacionHandler {
    private ValidacionHandler nextHandler;
    private static final Pattern PASSWORD_PATTERN = 
        Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

    @Override
    public ValidacionHandler setNextHandler(ValidacionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    @Override
    public boolean validar(Usuario usuario) {
        String password = usuario.getContraseña();
        
        if (password.length() < 8) {
            showError("La contraseña debe tener al menos 8 caracteres");
            return false;
        }
        
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            showError("La contraseña debe contener:\n- Al menos una mayúscula\n- Al menos una minúscula\n- Al menos un número\n- Al menos un carácter especial");
            return false;
        }
        
        return nextHandler == null || nextHandler.validar(usuario);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, 
            "Error en contraseña:\n" + message, 
            "Error de Validación", 
            JOptionPane.ERROR_MESSAGE);
    }
}