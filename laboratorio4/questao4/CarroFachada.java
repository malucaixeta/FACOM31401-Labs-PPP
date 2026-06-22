package questao4;

public class CarroFachada {

    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(Motor motor, CintoDeSeguranca cinto, Porta porta, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void iniciarCorrida(String estacao) {
        System.out.println("=== Iniciando corrida ===");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacao);
    }

    public void encerrarCorrida() {
        System.out.println("=== Encerrando corrida ===");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
