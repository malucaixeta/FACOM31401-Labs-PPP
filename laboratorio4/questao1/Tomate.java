public class Tomate extends PizzaDecorator {

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", tomate";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 2.00;
    }
}
