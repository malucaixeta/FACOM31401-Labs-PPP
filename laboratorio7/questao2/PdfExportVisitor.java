public class PdfExportVisitor implements DocumentVisitor {
    public void visit(Paragraph p) {
        System.out.println("[PDF] paragrafo: " + p.texto);
    }

    public void visit(Image i) {
        System.out.println("[PDF] imagem: " + i.arquivo);
    }

    public void visit(Table t) {
        System.out.println("[PDF] tabela " + t.linhas + "x" + t.colunas);
    }
}