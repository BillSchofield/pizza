import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Order order = new Order(new OrderTaker(System.out, new BufferedReader(new InputStreamReader(System.in))));
        CashRegister cashRegister = new CashRegister(order, System.out);

        cashRegister.printTotal();
    }
}
