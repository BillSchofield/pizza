public class Main {

    public static void main(String[] args) {
        Order order = new Order(6);
        CashRegister cashRegister = new CashRegister(order, System.out);

        cashRegister.printTotal();
    }
}
