package questao4;

public class InvestidorObserver implements Observer {

    private String nome;
    private double precoMinimo;
    private double precoMaximo;
    private AcaoBroker broker;

    public InvestidorObserver(String nome, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.broker = new AcaoBroker(nome);
    }

    @Override
    public void update(String nomeAcao, double preco) {
        System.out.println("[Investidor " + nome + "] Preco atual de " + nomeAcao + ": R$ " + preco);
        if (preco >= precoMaximo) {
            broker.vender(nomeAcao, preco);
        } else if (preco <= precoMinimo) {
            broker.comprar(nomeAcao, preco);
        }
    }
}
