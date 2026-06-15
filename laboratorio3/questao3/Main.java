// Problema: meu aparelho tem plug de 2 pinos, mas a parede tem tomada de 3 pinos

public class Main {
    public static void main(String[] args) {

        TomadaDoisPinos dispositivo = new AdaptadorTomada(new TomadaTresPinos());

        System.out.println("Ligando dispositivo via adaptador");
        dispositivo.ligar();
    }
}