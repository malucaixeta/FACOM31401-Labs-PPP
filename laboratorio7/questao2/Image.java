public class Image extends DocumentElement {
    String arquivo;

    Image(String arquivo) {
        this.arquivo = arquivo;
    }

    void accept(DocumentVisitor v) {
        v.visit(this);
    }
}