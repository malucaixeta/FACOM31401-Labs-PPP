public class HtmlExportVisitor implements DocumentVisitor {
    public void visit(Paragraph p) {
        System.out.println("<p>" + p.texto + "</p>");
    }

    public void visit(Image i) {
        System.out.println("<img src=\"" + i.arquivo + "\">");
    }

    public void visit(Table t) {
        System.out.println("<table " + t.linhas + "x" + t.colunas + "></table>");
    }
}