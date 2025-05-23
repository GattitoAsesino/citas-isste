package Vista;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(Usuario usuario) {
        for (Observer observer : observers) {
            observer.update(usuario);
        }
    }
}