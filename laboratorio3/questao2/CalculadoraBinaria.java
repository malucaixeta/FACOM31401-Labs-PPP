public class CalculadoraBinaria {

    public String somar(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(n1 + n2);
    }

    public String subtrair(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(n1 - n2);
    }
}
