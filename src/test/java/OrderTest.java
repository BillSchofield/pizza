import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTest {


    private OrderTaker mockOrderTaker;

    @Before
    public void setUp() throws Exception {
        mockOrderTaker = mock(OrderTaker.class);
    }

    @Test
    public void shouldComputeZeroTotalForZeroPizzas() throws IOException {
        when(mockOrderTaker.takeOrder()).thenReturn(0);
        Order order = new Order(mockOrderTaker);
        assertThat(order.computeTotal(), is(0));
    }

    @Test
    public void shouldComputeSixTotalForOnePizza() throws IOException {
        when(mockOrderTaker.takeOrder()).thenReturn(1);
        Order order = new Order(mockOrderTaker);
        assertThat(order.computeTotal(), is(6));
    }
}
