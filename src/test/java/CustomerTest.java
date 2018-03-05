import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Christie", 10.00);
    }

    @Test
    public void testHasName() {
        assertEquals("Christie", customer.getName);
    }
}
