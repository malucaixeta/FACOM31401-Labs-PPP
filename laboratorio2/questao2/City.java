public class City implements IVehicle {
    @Override public void start() { System.out.println("City ligando..."); }
    @Override public void drive() { System.out.println("City rodando..."); }
    @Override public void stop()  { System.out.println("City parando."); }
}

class Civic implements IVehicle {
    @Override public void start() { System.out.println("Civic ligando..."); }
    @Override public void drive() { System.out.println("Civic rodando..."); }
    @Override public void stop()  { System.out.println("Civic parando."); }
}

class Fit implements IVehicle {
    @Override public void start() { System.out.println("Fit ligando..."); }
    @Override public void drive() { System.out.println("Fit rodando..."); }
    @Override public void stop()  { System.out.println("Fit parando."); }
}