import java.io.PrintStream;

public class OrderTaker {
    private java.io.PrintStream printStream;

    public OrderTaker(PrintStream printStream) {

        this.printStream = printStream;
    }

    public int takeOrder() {
        printStream.println("How many cheese pizzas do you want?");
        return 6;
    }


}
