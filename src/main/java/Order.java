import java.io.IOException;
import java.util.ArrayList;

public class Order {

    private final int price;
    private final ArrayList<Pizza> pizzas;

    public Order(OrderTaker orderTaker) throws IOException {
        int quantity = orderTaker.takeOrder();
        pizzas = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
             pizzas.add(new Pizza());
        }
        price = 6;
    }

    public int computeTotal() {
        return price * pizzas.size();
    }
}
