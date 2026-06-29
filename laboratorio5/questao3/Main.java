package questao3;

public class Main {

    public static void main(String[] args) {

        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        Prefeitura prefeitura = new Prefeitura();
        Aeroporto aeroporto = new Aeroporto();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        System.out.println("=== Leitura 1 ===");
        cet.setDados(28.0, 25.0, 70.0);

        System.out.println();

        System.out.println("=== Leitura 2 ===");
        cet.setDados(32.0, 45.0, 30.0);
    }
}
