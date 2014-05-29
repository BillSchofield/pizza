public class Main {

    public static void main(String[] args) {
        Order order = new Order(new OrderTaker());
        CashRegister cashRegister = new CashRegister(order, System.out);

        cashRegister.printTotal();
    }

}
