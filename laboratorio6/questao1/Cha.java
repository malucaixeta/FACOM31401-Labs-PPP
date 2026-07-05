public class Cha extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando chá...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando condimentos no chá...");
    }
}
