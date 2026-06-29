package questao4;

public class Main {

    public static void main(String[] args) {

        Acao acao = new Acao("PETR4", 30.00);

        InvestidorObserver ana = new InvestidorObserver("Ana", 25.00, 40.00);
        InvestidorObserver bruno = new InvestidorObserver("Bruno", 28.00, 35.00);

        acao.addInvestidor(ana);
        acao.addInvestidor(bruno);

        System.out.println("=== Preço sobe para R$ 35 ===");
        acao.setPreco(35.00);

        System.out.println();

        System.out.println("=== Preço sobe para R$ 42 ===");
        acao.setPreco(42.00);

        System.out.println();

        System.out.println("=== Preço cai para R$ 24 ===");
        acao.setPreco(24.00);
    }
}
