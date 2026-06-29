package questao4;

public class AcaoBroker {

    private String nomeInvestidor;

    public AcaoBroker(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public void comprar(String nomeAcao, double preco) {
        System.out.println("[Broker de " + nomeInvestidor + "] Comprando acao " + nomeAcao + " por R$ " + preco);
    }

    public void vender(String nomeAcao, double preco) {
        System.out.println("[Broker de " + nomeInvestidor + "] Vendendo acao " + nomeAcao + " por R$ " + preco);
    }
}
