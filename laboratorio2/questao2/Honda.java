// Padrão SINGLETON: só existe uma instância de Honda no sistema
//   Motivo: representa uma única empresa, não faz sentido criar várias

// Padrão FACTORY em makeVehicle:
//   Motivo: centraliza a criação dos modelos Honda
//   Se um novo modelo surgir, só muda aqui (o Main não precisa saber)
public class Honda implements IVehicleMaker {

    private static Honda instance;

    private Honda() {}

    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("City")) {
            return new City();
        } else if (modelo.equals("Civic")) {
            return new Civic();
        } else if (modelo.equals("Fit")) {
            return new Fit();
        } else {
            System.out.println("Modelo '" + modelo + "' não fabricado pela Honda.");
            return null;
        }
    }
}