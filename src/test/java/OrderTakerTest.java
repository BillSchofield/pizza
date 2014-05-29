import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OrderTakerTest {
    private PrintStream printStream;

    @Test
    public void shouldPromptUserForQuantity() {
        printStream = mock(PrintStream.class);
        OrderTaker orderTaker = new OrderTaker(printStream);
        orderTaker.takeOrder();
        verify(printStream).println("How many cheese pizzas do you want?");
    }


}
