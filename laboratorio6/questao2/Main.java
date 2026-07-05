/*
 Diferença entre Template Method e Decorator:

 No Template Method, a ordem das etapas do algoritmo é sempre a mesma,
 e isso é definido na classe pai. As subclasses apenas preenchem o
 conteúdo de algumas etapas, sem poder mudar a ordem. Essa relação é
 feita por herança e já é decidida no momento em que se escreve o
 código, ao escolher qual subclasse instanciar.

 Já o Decorator serve para adicionar funcionalidades a um objeto sem
 alterar sua classe original, "envolvendo" o objeto com outro que
 adiciona um comportamento extra. Diferente do Template Method, não
 existe uma estrutura fixa de passos: as combinações de comportamento
 podem ser montadas livremente, inclusive durante a execução do
 programa e não apenas quando o código é escrito.
 */

public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline(3, 25.0);
        Pedido pedidoLoja = new PedidoLoja(2, 15.0);
        Pedido pedidoCripto = new PedidoCripto(1, 100.0);

        System.out.println("=== Pedido Online ===");
        pedidoOnline.processar();

        System.out.println("\n=== Pedido na Loja ===");
        pedidoLoja.processar();

        System.out.println("\n=== Pedido com Criptomoedas ===");
        pedidoCripto.processar();
    }
}
