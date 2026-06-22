public class Ovo extends PizzaDecorator {

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 2.50;
    }
}
