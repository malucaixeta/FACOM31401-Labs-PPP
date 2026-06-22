package questao3;

public class Cinemateca {

    public static void main(String[] args) {

        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        HomeTheaterFachada homeTheater = new HomeTheaterFachada(amp, luzes, pipoca, projetor, player, telao);
        homeTheater.assistirFilme("A Origem");
        System.out.println();
        homeTheater.fimDoFilme();
    }
}
