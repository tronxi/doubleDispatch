package doubeDispatch;

public class Man extends Person {

    @Override
    void accept(PersonVisitor personVisitor) {
        personVisitor.visit(this);
    }
}
