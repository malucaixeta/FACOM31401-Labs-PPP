public class Cappuccino extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando cappuccino...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando condimentos no cappuccino...");
    }
}
