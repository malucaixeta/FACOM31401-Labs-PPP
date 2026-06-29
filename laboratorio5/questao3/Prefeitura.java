package questao3;

public class Prefeitura implements Observer {

    @Override
    public void update(double temperatura, double umidade, double vento) {
        System.out.println("[Prefeitura de Uberlandia] Umidade: " + umidade + "%");
        if (umidade < 30) {
            System.out.println("[Prefeitura de Uberlandia] ALERTA: umidade baixa! Emitindo alerta da defesa civil.");
        }
    }
}
