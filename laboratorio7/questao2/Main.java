import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> documento = new ArrayList<>();
        documento.add(new Paragraph("Este eh um editor de documentos rich-text."));
        documento.add(new Image("logo.png"));
        documento.add(new Table(3, 2));

        System.out.println("=== Exportar para HTML ===");
        DocumentVisitor html = new HtmlExportVisitor();
        for (DocumentElement e : documento) e.accept(html);

        System.out.println("\n=== Exportar para PDF ===");
        DocumentVisitor pdf = new PdfExportVisitor();
        for (DocumentElement e : documento) e.accept(pdf);

        System.out.println("\n=== Contagem de palavras ===");
        WordCountVisitor wc = new WordCountVisitor();
        for (DocumentElement e : documento) e.accept(wc);
        System.out.println("Total: " + wc.total + " palavras");
    }
}