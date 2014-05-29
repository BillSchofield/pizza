import java.io.PrintStream;

public class CashRegister {

    private Order order;
    private PrintStream printStream;

    public CashRegister(Order order, PrintStream printStream) {
        this.order = order;
        this.printStream = printStream;
    }

    public void printTotal() {
        printStream.println("Total: $" + order.computeTotal());
    }
}
