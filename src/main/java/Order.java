public class Order {

    private final int price;
    private int quantity;

    public Order(OrderTaker orderTaker) {
        this.quantity = orderTaker.invoke();
        price = 6;
    }

    public int computeTotal() {
        return price * this.quantity;
    }
}
