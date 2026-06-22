public class Canela extends BebidaDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", canela";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.50;
    }
}
