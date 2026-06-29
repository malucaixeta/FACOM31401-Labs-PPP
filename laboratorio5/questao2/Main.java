package questao2;

public class Main {

    public static void main(String[] args) {

        PagamentoStrategy pagamento = new PixPagamento();
        FreteStrategy frete = new SedexFrete();
        CarrinhoCompras carrinho = new CarrinhoCompras(pagamento, frete);

        Item teclado = new Item();
        teclado.setNome("Teclado");
        teclado.setPreco(150);

        Item mouse = new Item();
        mouse.setNome("Mouse");
        mouse.setPreco(80);

        carrinho.adicionaItem(teclado);
        carrinho.adicionaItem(mouse);
        System.out.println("Frete via Sedex: R$ " + carrinho.calculaFrete());
        carrinho.realizaPagamento();
    }
}