import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderTest {

    private Order order;

    @Before
    public void setUp() throws Exception {
        order = new Order();
    }

    @Test
    public void shouldComputeZeroTotalForZeroPizzas() {

        int numberOfCheesePizzas = 0;
        assertThat(order.computeTotal(numberOfCheesePizzas), is(0));
    }

    @Test
    public void shouldComputeSixTotalForOnePizza() {
        int numberOfCheesePizzas = 1;
        assertThat(order.computeTotal(numberOfCheesePizzas), is(6));
    }
}
