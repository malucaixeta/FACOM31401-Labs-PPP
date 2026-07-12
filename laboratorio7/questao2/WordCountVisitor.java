public class WordCountVisitor implements DocumentVisitor {
    int total = 0;

    public void visit(Paragraph p) {
        total += p.texto.split("\\s+").length;
    }

    public void visit(Image i) {
        // imagem não tem palavras
    }

    public void visit(Table t) {
        // tabela simplificada não tem texto contável
    }
}