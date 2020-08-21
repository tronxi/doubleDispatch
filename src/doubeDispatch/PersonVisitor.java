package doubeDispatch;

public interface PersonVisitor {
    void visit(Man man);
    void visit(Woman woman);
}
