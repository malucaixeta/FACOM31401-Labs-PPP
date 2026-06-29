package questao1;

public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Boleto.");
    }
}
