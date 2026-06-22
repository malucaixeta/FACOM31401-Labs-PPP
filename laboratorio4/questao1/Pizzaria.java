public class Pizzaria {

    public static void main(String[] args) {

        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));
        System.out.println("Pizza Marguerita");
        System.out.println(marguerita.getDescricao());
        System.out.println(marguerita.getCusto());

        System.out.println();

        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessaPizza())));
        System.out.println("Pizza Portuguesa");
        System.out.println(portuguesa.getDescricao());
        System.out.println(portuguesa.getCusto());
    }
}