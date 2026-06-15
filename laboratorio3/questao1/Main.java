public class Main {
    public static void main(String[] args) {

        Ave ave1 = new AdaptadorPato(new PatoDomestico());
        Ave ave2 = new AdaptadorPavao(new PavaoAzul());

        System.out.println("Testando Ave 1 (Pato Domestico)");
        ave1.voar();
        ave1.emitirSom();

        System.out.println("Testando Ave 2 (Pavao Azul)");
        ave2.voar();
        ave2.emitirSom();
    }
}
