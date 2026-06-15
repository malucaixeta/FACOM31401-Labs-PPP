// Objeto base: a impressora de verdade
// O cliente não acessa essa classe diretamente —> passa pelo proxy

public class ImpressoraReal implements Impressora {

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}