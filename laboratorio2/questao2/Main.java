public class Main {
    public static void main(String[] args) {

        // Uso do Singleton para pegar as fábricas
        IVehicleMaker toyota = Toyota.getInstance();
        IVehicleMaker honda  = Honda.getInstance();

        // Uso da Factory para fabricar os carros
        IVehicle corolla = toyota.makeVehicle("Corolla");
        IVehicle hilux   = toyota.makeVehicle("Hilux");
        IVehicle civic   = honda.makeVehicle("Civic");
        IVehicle fit     = honda.makeVehicle("Fit");

        System.out.println("=== Testando veículos ===");
        corolla.start(); corolla.drive(); corolla.stop();
        System.out.println();
        fit.start();     fit.drive();     fit.stop();
        
        System.out.println("\n=== Modelo inexistente ===");
        toyota.makeVehicle("Ferrari");
    }
}