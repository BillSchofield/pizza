import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderTest {



    @Test
    public void shouldComputeZeroTotalForZeroPizzas() {
        Order order = new Order(0);
        assertThat(order.computeTotal(), is(0));
    }

    @Test
    public void shouldComputeSixTotalForOnePizza() {
        Order order = new Order(1);
        assertThat(order.computeTotal(), is(6));
    }
}
