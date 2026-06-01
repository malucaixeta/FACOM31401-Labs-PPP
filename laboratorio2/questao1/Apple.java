// Padrão SINGLETON: só existe uma instância de Apple no sistema
// Padrão FÁBRICA: constroiCelular centraliza a criação dos modelos
public class Apple implements FabricanteCelular {

    private static Apple instance;

    private Apple() {}

    public static Apple getInstance() {
        if (instance == null) {
            instance = new Apple();
        }
        return instance;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IPhoneX")) {
            return new IPhoneX();
        } else if (modelo.equals("IPhoneS")) {
            return new IPhoneS();
        } else {
            System.out.println("Modelo " + modelo + " não disponível.");
            return null;
        }
    }
}