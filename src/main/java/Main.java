import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        OrderTaker orderTaker = new OrderTaker(System.out, new BufferedReader(new InputStreamReader(System.in)));
        Order order = new Order(orderTaker);
        CashRegister cashRegister = new CashRegister(order, System.out);

        cashRegister.printTotal();
    }
}
