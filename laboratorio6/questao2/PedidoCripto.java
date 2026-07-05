public class PedidoCripto extends Pedido {
    public PedidoCripto(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento via criptomoedas. Total: R$ " + valorTotal);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Pedido será entregue após confirmação da transação.");
    }
}
