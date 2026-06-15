public class AdaptadorPato implements Ave {

    private Pato pato;

    public AdaptadorPato(Pato pato) {
        this.pato = pato;
    }

    public void voar() {
        pato.voar();
    }

    public void emitirSom() {
        pato.grasnar();
    }
}
