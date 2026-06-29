package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    PagamentoStrategy pagamentoStrategy;
    FreteStrategy freteStrategy;

    List<Item> itens = new ArrayList();

    public CarrinhoCompras(PagamentoStrategy ps, FreteStrategy fs) {
        this.pagamentoStrategy = ps;
        this.freteStrategy = fs;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item i : itens) {
            total += i.getPreco();
        }
        return total;
    }

    public double calculaFrete() {
        return freteStrategy.calcularFrete();
    }

    public void realizaPagamento() {
        double total = calculaTotal() + calculaFrete();
        pagamentoStrategy.pagar(total);
    }
}