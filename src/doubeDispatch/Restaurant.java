package doubeDispatch;

public class Restaurant {

    public Restaurant() {
        Waiter waiter = new Waiter();
        Person man = new Man();
        Person woman = new Woman();

        waiter.receive(man);
        waiter.receive(woman);
    }

    public static void main(String [] args) {
        new Restaurant();
    }
}
