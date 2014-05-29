public class Pizza {
    private final int price;
    private int quantity;

    public Pizza(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int totalPrice() {
        return price * quantity;
    }
}
