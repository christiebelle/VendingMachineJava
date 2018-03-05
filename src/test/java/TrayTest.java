import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {

    private Tray tray;

    @Before
    public void setUp() throws Exception {
        tray = new Tray(0.50, 10);
    }

    @Test
    public void testTrayPrice() {
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

    @Test
    public void testStockLevelZero() {
        assertEquals(0, tray.getStockLevel());
    }

    //check trays have a price
    //check tray stock
    //check we can add an item to a tray
    //check we can remove an item from a tray
    //check we cannot add items beyond a tray's capacity
}
