public class Main {
    public static void main(String[] args) {

        // Singleton: obtemos a instância única, sem usar "new"
        FabricanteCelular samsung = Samsung.getInstance();
        FabricanteCelular apple   = Apple.getInstance();

        // Factory: criando os objetos sem usar 'new' diretamente nos produtos
        Celular g8  = samsung.constroiCelular("Galaxy8");
        Celular g20 = samsung.constroiCelular("Galaxy20");
        Celular ix  = apple.constroiCelular("IPhoneX");
        Celular is  = apple.constroiCelular("IPhoneS");

        System.out.println("=== Testando celulares ===");
        g8.fazLigacao();  g8.tiraFoto();
        g20.fazLigacao(); g20.tiraFoto();
        ix.fazLigacao();  ix.tiraFoto();
        is.fazLigacao();  is.tiraFoto();

    }
}