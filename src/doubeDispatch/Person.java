package doubeDispatch;

public abstract class Person {
    abstract void accept(PersonVisitor personVisitor);
}
