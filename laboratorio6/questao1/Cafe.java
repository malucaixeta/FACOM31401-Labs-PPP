public class Cafe extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando condimentos no café...");
    }
}
