    // Modelos Samsung
    class Galaxy8 implements Celular {
        @Override
        public void fazLigacao() { System.out.println("Galaxy 8 fazendo ligação..."); }
        @Override
        public void tiraFoto() { System.out.println("Galaxy 8 tirando foto..."); }
    }

    class Galaxy20 implements Celular {
        @Override
        public void fazLigacao() { System.out.println("Galaxy 20 fazendo ligação..."); }
        @Override
        public void tiraFoto() { System.out.println("Galaxy 20 tirando foto..."); }
    }


    // Modelos Apple
    class IPhoneX implements Celular {
        @Override
        public void fazLigacao() { System.out.println("IPhone X fazendo ligação..."); }
        @Override
        public void tiraFoto() { System.out.println("IPhone X tirando foto..."); }
    }

    class IPhoneS implements Celular {
        @Override
        public void fazLigacao() { System.out.println("IPhone S fazendo ligação..."); }
        @Override
        public void tiraFoto() { System.out.println("IPhone S tirando foto..."); }
    }

