import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class OrderTaker {
    private java.io.PrintStream printStream;
    private BufferedReader bufferedReader;

    public OrderTaker(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public int takeOrder() throws IOException {
        printStream.println("How many cheese pizzas do you want?");
        return Integer.parseInt(bufferedReader.readLine());
    }


}
