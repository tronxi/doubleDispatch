package doubeDispatch;

public class Waiter implements PersonVisitor{

    public void receive(Person person) {
        person.accept(this);
    }
    @Override
    public void visit(Man man) {
        System.out.println("hello man");
    }

    @Override
    public void visit(Woman woman) {
        System.out.println("hello woman");
    }
}
