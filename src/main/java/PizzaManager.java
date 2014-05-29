import java.io.PrintStream;

public class PizzaManager {

    private Order order;
    private PrintStream printStream;

    public PizzaManager(Order order, PrintStream printStream) {
        this.order = order;
        this.printStream = printStream;
    }

    public void printTotal() {
        printStream.println("Total: $" + order.computeTotal(0));
    }
}
