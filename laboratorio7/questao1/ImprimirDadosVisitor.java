public class ImprimirDadosVisitor implements Visitor {

    @Override
    public void visit(Carro c) {
        System.out.println("Carro -> cor: " + c.getCor()
                + ", marca: " + c.getMarca()
                + ", modelo: " + c.getModelo());
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Onibus -> quantidade de lugares: " + o.getQuantidadeLugares()
                + ", ano de fabricacao: " + o.getAnoFabricacao());
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Bicicleta -> cor: " + b.getCor());
    }
}
