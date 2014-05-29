import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Pizza> pizzas = new ArrayList<>();

    public Order(OrderTaker orderTaker) throws IOException {
        int quantityOfCheesePizzas = orderTaker.takeOrder();
        Pizza cheesePizzas = new Pizza(quantityOfCheesePizzas);
        pizzas.add(cheesePizzas);
    }

    public Order(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public int computeTotal() {
        int totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.totalPrice();
        }
        return totalPrice;
    }
}
