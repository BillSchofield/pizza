public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        PizzaManager pizzaManager = new PizzaManager(order, System.out);

        pizzaManager.printTotal();
    }
}
