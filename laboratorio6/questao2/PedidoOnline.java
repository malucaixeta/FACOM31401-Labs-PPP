public class PedidoOnline extends Pedido {
    public PedidoOnline(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento online via cartão. Total: R$ " + valorTotal);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Pedido será entregue no endereço cadastrado.");
    }
}
