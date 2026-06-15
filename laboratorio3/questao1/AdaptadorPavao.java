public class AdaptadorPavao implements Ave {

    private Pavao pavao;

    public AdaptadorPavao(Pavao pavao) {
        this.pavao = pavao;
    }

    public void voar() {
        System.out.println("Pavao não voa");
    }

    public void emitirSom() {
        pavao.cantar();
    }
}
