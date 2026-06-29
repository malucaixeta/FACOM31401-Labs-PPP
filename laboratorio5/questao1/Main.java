package questao1;

public class Main {

    public static void main(String[] args) {

        PagamentoStrategy strategy = new PixPagamento();
        CarrinhoCompras carrinho = new CarrinhoCompras(strategy);

        Item teclado = new Item();
        teclado.setNome("Teclado");
        teclado.setPreco(150);

        Item mouse = new Item();
        mouse.setNome("Mouse");
        mouse.setPreco(80);

        carrinho.adicionaItem(teclado);
        carrinho.adicionaItem(mouse);
        carrinho.realizaPagamento();
    }
}