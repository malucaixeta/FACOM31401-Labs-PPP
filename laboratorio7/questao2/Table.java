public class Table extends DocumentElement {
    int linhas, colunas;

    Table(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }

    void accept(DocumentVisitor v) {
        v.visit(this);
    }
}