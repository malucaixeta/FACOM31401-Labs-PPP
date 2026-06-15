// Adaptador: permite usar a TomadaTresPinos como se fosse TomadaDoisPinos
public class AdaptadorTomada implements TomadaDoisPinos {

    private TomadaTresPinos tomadaAntiga;

    public AdaptadorTomada(TomadaTresPinos tomadaAntiga) {
        this.tomadaAntiga = tomadaAntiga;
    }

    @Override
    public void ligar() {
        tomadaAntiga.ligarTresPinos();
    }
}