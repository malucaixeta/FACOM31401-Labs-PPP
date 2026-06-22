package questao3;

public class HomeTheaterFachada {

    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca pipoca;
    private Projetor projetor;
    private PlayerDeStreaming player;
    private Telao telao;

    public HomeTheaterFachada(Amplificador amplificador, Luzes luzes, MaquinaDePipoca pipoca, Projetor projetor, PlayerDeStreaming player, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.pipoca = pipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        System.out.println("=== Preparando para assistir o filme ===");
        pipoca.liga();
        pipoca.rebentar();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajustaVolume(10);
        player.liga();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("=== Fim do filme. Desligando tudo ===");
        player.desliga();
        projetor.desliga();
        amplificador.desliga();
        telao.sobe();
        luzes.liga();
        pipoca.desliga();
    }
}
