public class Paragraph extends DocumentElement {
    String texto;

    Paragraph(String texto) {
        this.texto = texto;
    }

    void accept(DocumentVisitor v) {
        v.visit(this);
    }
}