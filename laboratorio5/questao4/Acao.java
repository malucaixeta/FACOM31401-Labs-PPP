package questao4;

import java.util.ArrayList;
import java.util.List;

public class Acao {

    private String nome;
    private double preco;
    private List<Observer> investidores;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.investidores = new ArrayList<>();
    }

    public void addInvestidor(Observer observer) {
        investidores.add(observer);
    }

    public void removeInvestidor(Observer observer) {
        investidores.remove(observer);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notifyInvestidores();
    }

    private void notifyInvestidores() {
        for (Observer i : investidores) {
            i.update(nome, preco);
        }
    }
}
