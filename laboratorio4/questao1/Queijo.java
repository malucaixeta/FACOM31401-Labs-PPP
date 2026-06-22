public class Queijo extends PizzaDecorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", queijo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 3.00;
    }
}
