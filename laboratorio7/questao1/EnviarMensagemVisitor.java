public class EnviarMensagemVisitor implements Visitor {

    @Override
    public void visit(Carro c) {
        System.out.println("Mensagem para dono do Carro (" + c.getModelo() + "): "
                + "\"favor atualizar dados do IPVA\"");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Mensagem para dono do Onibus: "
                + "\"atencao para atualizacao das licencas\"");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Mensagem para dono da Bicicleta: "
                + "\"comemore no parque o dia do ciclismo\"");
    }
}
