public class Main {
    public static void main(String[] args) {

        ImpressoraReal impressoraReal = new ImpressoraReal();

        // Proxy criado com 1 folha de papel
        ProxyImpressora proxy = new ProxyImpressora(impressoraReal, 1);

        System.out.println("==Tentativa com papel disponivel==");
        proxy.imprimir("Relatorio.pdf");

        System.out.println("\n==Tentativa sem papel==");
        proxy.imprimir("Curriculo.pdf");

        System.out.println("\n==Adicionando papel e tentando novamente==");
        proxy.adicionarPapel(2);
        proxy.imprimir("Curriculo.pdf");
        proxy.imprimir("Contrato.pdf");
    }
}