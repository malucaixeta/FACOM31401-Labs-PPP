public class Bicicleta extends Veiculo {

    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
