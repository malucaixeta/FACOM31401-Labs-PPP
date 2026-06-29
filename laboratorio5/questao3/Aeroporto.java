package questao3;

public class Aeroporto implements Observer {

    @Override
    public void update(double temperatura, double umidade, double vento) {
        System.out.println("[Aeroporto de Uberlandia] Velocidade do vento: " + vento + " km/h");
        if (vento > 60) {
            System.out.println("[Aeroporto de Uberlandia] INFORMA: Rajadas de vento perigosas.");
        }
    }
}
