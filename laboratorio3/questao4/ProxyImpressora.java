// Proxy: intermediário entre o cliente e a ImpressoraReal
// Possui a mesma interface que o objeto base (Impressora)
// Adiciona uma verificação: só imprime se houver papel

public class ProxyImpressora implements Impressora {

    private ImpressoraReal impressoraReal;
    private int quantidadeDePapel;

    public ProxyImpressora(ImpressoraReal impressoraReal, int quantidadeDePapel) {
        this.impressoraReal = impressoraReal;
        this.quantidadeDePapel = quantidadeDePapel;
    }

    public void adicionarPapel(int quantidade) {
        quantidadeDePapel += quantidade;
        System.out.println("Papel adicionado. Total: " + quantidadeDePapel + " folhas");
    }

    @Override
    public void imprimir(String documento) {

        if (quantidadeDePapel <= 0) {
            System.out.println("Sem papel. Nao foi possivel imprimir: " + documento);
            return;
        }
        quantidadeDePapel--;
        impressoraReal.imprimir(documento);
        System.out.println("Papel restante: " + quantidadeDePapel + " folhas");
    }
}