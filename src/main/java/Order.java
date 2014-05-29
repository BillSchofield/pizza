import java.io.IOException;
import java.util.ArrayList;

public class Order {

    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    public Order(OrderTaker orderTaker) throws IOException {
        int quantityOfCheesePizzas = orderTaker.takeOrder("cheese");
        pizzas.add(new Pizza(6, quantityOfCheesePizzas));

        int quantityOfPepperoniPizzas = orderTaker.takeOrder("pepperoni");
        pizzas.add(new Pizza(7, quantityOfPepperoniPizzas));
    }

    public int computeTotal() {
        int totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.totalPrice();
        }
        return totalPrice;
    }
}
