import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTest {

    private List<Pizza> pizzas;
    private Order order;

    @Before
    public void setUp() throws Exception {
        pizzas = new ArrayList<>();
        order = new Order(pizzas);
    }

    @Test
    public void shouldComputeZeroTotalForZeroPizzas() throws IOException {
        assertThat(order.computeTotal(), is(0));
    }

    @Test
    public void shouldComputeEighteenTotalForThreePizzas() throws IOException {
        Pizza pizza = mock(Pizza.class);
        when(pizza.totalPrice()).thenReturn(18);

        pizzas.add(pizza);

        assertThat(order.computeTotal(), is(18));
    }
}
