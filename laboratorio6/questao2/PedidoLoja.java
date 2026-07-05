public class PedidoLoja extends Pedido {
    public PedidoLoja(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento na loja. Total: R$ " + valorTotal);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Sem entrega: cliente retira o produto na loja.");
    }
}
