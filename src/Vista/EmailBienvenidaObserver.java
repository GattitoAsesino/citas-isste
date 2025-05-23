package Vista;

import Clases.Usuario;
import javax.swing.JOptionPane;

public class EmailBienvenidaObserver implements Observer {
    @Override
    public void update(Usuario usuario) {
        // Simulación de envío de email
        System.out.println("[DEBUG] Email enviado a: " + usuario.getCorreo());
        JOptionPane.showMessageDialog(
            null, 
            "Email de bienvenida enviado a: " + usuario.getCorreo(),
            "Registro Exitoso",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}