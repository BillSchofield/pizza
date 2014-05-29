import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CashRegisterTest {

    private Order mockOrder;
    private CashRegister cashRegister;
    private PrintStream mockPrintStream;

    @Before
    public void setUp() throws Exception {
        mockOrder = mock(Order.class);
        mockPrintStream = mock(PrintStream.class);
        cashRegister = new CashRegister(mockOrder, mockPrintStream);
    }

    @Test
    public void shouldTellOrderToComputeTotal() {

        cashRegister.printTotal();

        verify(mockOrder).computeTotal();
    }

    @Test
    public void shouldPrintTotal() {
        when(mockOrder.computeTotal()).thenReturn(123);
        cashRegister.printTotal();
        verify(mockPrintStream).println("Total: $123");
    }



}