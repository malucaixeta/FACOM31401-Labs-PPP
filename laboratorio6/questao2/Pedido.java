public abstract class Pedido {
    protected int quantidade;
    protected double valorItem;

    public Pedido(int quantidade, double valorItem) {
        this.quantidade = quantidade;
        this.valorItem = valorItem;
    }

    // Template Method
    public final void processar() {
        double valorTotal = quantidade * valorItem;
        processarPagamento(valorTotal);
        decidirEntrega();
    }

    protected abstract void processarPagamento(double valorTotal);

    protected abstract void decidirEntrega();
}
