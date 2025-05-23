package Vista;

import Clases.Usuario;

public class RegistroSubject extends Subject {
    public void notifyRegistroExitoso(Usuario usuario) {
        notifyObservers(usuario);
    }
}