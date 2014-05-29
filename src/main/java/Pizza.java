public class Pizza {
    private final int price = 6;
    private int quantity;

    public Pizza(int quantity) {
        this.quantity = quantity;
    }

    public int totalPrice() {
        return price * quantity;
    }
}
