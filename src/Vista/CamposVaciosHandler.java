package Vista;

import javax.swing.JOptionPane;
import Clases.Usuario;

public class CamposVaciosHandler implements ValidacionHandler {
    private ValidacionHandler nextHandler;

    @Override
    public ValidacionHandler setNextHandler(ValidacionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.getNombre().isEmpty() || 
            usuario.getApellidoPaterno().isEmpty() || 
            usuario.getApellidoMaterno().isEmpty() || 
            usuario.getCurp().isEmpty() || 
            usuario.getRfc().isEmpty() || 
            usuario.getCorreo().isEmpty() || 
            usuario.getContraseña().isEmpty()) {
            
            showError("Todos los campos son obligatorios");
            return false;
        }
        
        return nextHandler == null || nextHandler.validar(usuario);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, 
            "Error en formulario:\n" + message, 
            "Error de Validación", 
            JOptionPane.ERROR_MESSAGE);
    }
}