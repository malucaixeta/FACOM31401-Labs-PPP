public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50;
    }
}
