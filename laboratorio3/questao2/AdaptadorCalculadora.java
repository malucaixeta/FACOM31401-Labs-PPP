public class AdaptadorCalculadora implements Calculadora {

    private CalculadoraBinaria calcBinaria;

    public AdaptadorCalculadora(CalculadoraBinaria calcBinaria) {
        this.calcBinaria = calcBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calcBinaria.somar(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calcBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
