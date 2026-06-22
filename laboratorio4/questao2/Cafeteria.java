public class Cafeteria {

    public static void main(String[] args) {

        // Espresso simples
        Bebida b1 = new Espresso();
        System.out.println(b1.getDescricao());
        System.out.println(b1.calculaCusto());

        System.out.println();

        // Decaf com leite e canela
        Bebida b2 = new Canela(new Leite(new Decaf()));
        System.out.println(b2.getDescricao());
        System.out.println(b2.calculaCusto());

        System.out.println();

        // Espresso com chocolate e leite
        Bebida b3 = new Leite(new Chocolate(new Espresso()));
        System.out.println(b3.getDescricao());
        System.out.println(b3.calculaCusto());
    }
}