import java.io.IOException;
import java.util.ArrayList;

public class Order {

    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    public Order(OrderTaker orderTaker) throws IOException {
        int quantity = orderTaker.takeOrder();
        pizzas.add(new Pizza(6, quantity));
    }

    public int computeTotal() {
        int totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.totalPrice();
        }
        return totalPrice;
    }
}
