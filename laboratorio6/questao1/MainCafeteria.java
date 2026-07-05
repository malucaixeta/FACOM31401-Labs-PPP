public class MainCafeteria {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        Bebida cappuccino = new Cappuccino();
        Bebida cha = new Cha();

        System.out.println("=== Preparando Café ===");
        cafe.preparar();

        System.out.println("\n=== Preparando Cappuccino ===");
        cappuccino.preparar();

        System.out.println("\n=== Preparando Chá ===");
        cha.preparar();
    }
}
