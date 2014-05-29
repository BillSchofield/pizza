import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PizzaManagerTest {

    private Order mockOrder;
    private PizzaManager pizzaManager;
    private PrintStream mockPrintStream;

    @Before
    public void setUp() throws Exception {
        mockOrder = mock(Order.class);
        mockPrintStream = mock(PrintStream.class);
        pizzaManager = new PizzaManager(mockOrder, mockPrintStream);
    }

    @Test
    public void shouldTellOrderToComputeTotal() {

        pizzaManager.printTotal();

        verify(mockOrder).computeTotal(any(Integer.class));
    }

    @Test
    public void shouldPrintTotal() {
        when(mockOrder.computeTotal(0)).thenReturn(123);
        pizzaManager.printTotal();
        verify(mockPrintStream).println("Total: $123");
    }


}