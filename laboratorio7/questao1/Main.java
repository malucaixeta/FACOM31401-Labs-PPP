import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add(new Carro("Preto", "Toyota", "Corolla"));
        listaDeVeiculos.add(new Onibus(42, 2019));
        listaDeVeiculos.add(new Bicicleta("Vermelha"));

        Visitor visitorImprimir = new ImprimirDadosVisitor();
        Visitor visitorMensagem = new EnviarMensagemVisitor();

        System.out.println("=== Imprimindo dados dos veiculos ===");
        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.accept(visitorImprimir);
        }

        System.out.println("\n=== Enviando mensagens aos donos ===");
        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.accept(visitorMensagem);
        }
    }
}
