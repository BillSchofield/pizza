public class Order {

    private int quantity;

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public int computeTotal() {
        return 6 * this.quantity;
    }
}
