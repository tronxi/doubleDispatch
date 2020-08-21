package doubeDispatch;

public class Woman extends Person {

    @Override
    void accept(PersonVisitor personVisitor) {
        personVisitor.visit(this);
    }
}
