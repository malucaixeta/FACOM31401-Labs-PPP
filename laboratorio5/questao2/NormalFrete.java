package questao2;

public class NormalFrete implements FreteStrategy {

    @Override
    public double calcularFrete() {
        return 15.00;
    }
}