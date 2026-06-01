// Padrão SINGLETON: só existe uma instância de Toyota no sistema
//   Motivo: representa uma única empresa, não faz sentido criar várias

// Padrão FACTORY em makeVehicle:
//   Motivo: centraliza a criação dos modelos Toyota
//   Se um novo modelo surgir, só muda aqui (o Main não precisa saber)

public class Toyota implements IVehicleMaker {

    private static Toyota instance;

    private Toyota() {}

    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("Corolla")) {
            return new Corolla();
        } else if (modelo.equals("Hilux")) {
            return new Hilux();
        } else if (modelo.equals("Etios")) {
            return new Etios();
        } else {
            System.out.println("Modelo '" + modelo + "' não fabricado pela Toyota.");
            return null;
        }
    }
}