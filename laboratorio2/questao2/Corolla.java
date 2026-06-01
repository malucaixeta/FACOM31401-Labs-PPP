public class Corolla implements IVehicle {
    @Override public void start() { System.out.println("Corolla ligando..."); }
    @Override public void drive() { System.out.println("Corolla rodando..."); }
    @Override public void stop()  { System.out.println("Corolla parando."); }
}

class Hilux implements IVehicle {
    @Override public void start() { System.out.println("Hilux ligando..."); }
    @Override public void drive() { System.out.println("Hilux rodando..."); }
    @Override public void stop()  { System.out.println("Hilux parando."); }
}

class Etios implements IVehicle {
    @Override public void start() { System.out.println("Etios ligando..."); }
    @Override public void drive() { System.out.println("Etios rodando..."); }
    @Override public void stop()  { System.out.println("Etios parando."); }
}