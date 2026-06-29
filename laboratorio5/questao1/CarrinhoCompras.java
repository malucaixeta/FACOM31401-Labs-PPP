package questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    PagamentoStrategy pagamentoStrategy;

    List<Item> itens = new ArrayList();

    public CarrinhoCompras(PagamentoStrategy ps) {
        this.pagamentoStrategy = ps;
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

    public void realizaPagamento() {
        double total = calculaTotal();
        pagamentoStrategy.pagar(total);
    }
}