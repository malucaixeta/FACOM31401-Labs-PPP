public class Main {
    public static void main(String[] args) {

        CalculadoraBinaria calcBin = new CalculadoraBinaria();
        System.out.println("Calculadora Binaria");
        System.out.println("0101 + 0011 = " + calcBin.somar("0101", "0011")); // 5+3 = 1000
        System.out.println("1010 - 0100 = " + calcBin.subtrair("1010", "0100")); // 10-4 = 110

        Calculadora calc = new AdaptadorCalculadora(new CalculadoraBinaria());
        System.out.println("\nCalculadora via Adaptador (com inteiros)");
        System.out.println("5 + 3 = " + calc.somar(5, 3));
        System.out.println("10 - 4 = " + calc.subtrair(10, 4));
        System.out.println("6 x 7 = " + calc.multiplicar(6, 7));
    }
}