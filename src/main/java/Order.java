import java.io.IOException;
import java.util.ArrayList;

public class Order {

    private final ArrayList<Pizza> pizzas;

    public Order(OrderTaker orderTaker) throws IOException {
        int quantity = orderTaker.takeOrder();
        pizzas = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
             pizzas.add(new Pizza(6));
        }
    }

    public int computeTotal() {
        int totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.getPrice();
        }
        return totalPrice;
    }
}
