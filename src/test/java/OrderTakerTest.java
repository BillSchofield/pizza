import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OrderTakerTest {
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void shouldPromptUserForQuantity() throws IOException {
        OrderTaker orderTaker = new OrderTaker(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("7");
        orderTaker.takeOrder();
        verify(printStream).println("How many cheese pizzas do you want?");
    }

    @Test
    public void shouldReadAndReturnUserInput() throws Exception {
        OrderTaker orderTaker = new OrderTaker(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("7");
        assertThat(orderTaker.takeOrder(), is(7));
    }

    @Test
    public void shouldCreatePizzas() throws Exception {
        OrderTaker orderTaker = new OrderTaker(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("7");
        Pizza pizza = orderTaker.takePizzaOrder();
        assertThat(pizza.totalPrice(), is(42));
    }

}