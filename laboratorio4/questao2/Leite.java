public class Leite extends BebidaDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.00;
    }
}
