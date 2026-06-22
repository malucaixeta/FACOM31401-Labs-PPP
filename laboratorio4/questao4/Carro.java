package questao4;

public class Carro {

    public static void main(String[] args) {

        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFachada carro = new CarroFachada(motor, cinto, porta, farol, radio);

        carro.iniciarCorrida("Radio FM");
        System.out.println();
        carro.encerrarCorrida();
    }
}
