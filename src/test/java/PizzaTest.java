import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void shouldHaveTotalPriceOfQuantityTimesPrice() {
        Pizza pizza = new Pizza(3, 4);
        assertThat(pizza.totalPrice(), is(12));
    }

}