package questao3;

import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Subject {

    private List<Observer> observers;
    private double temperatura;
    private double umidade;
    private double vento;

    public CentralEstacaoTempo() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperatura, umidade, vento);
        }
    }

    public void setDados(double temperatura, double umidade, double vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notifyObservers();
    }
}
