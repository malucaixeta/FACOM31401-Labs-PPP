public interface DocumentVisitor {
    void visit(Paragraph p);
    void visit(Image i);
    void visit(Table t);
}