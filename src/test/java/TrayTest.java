import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {

    private Tray tray;

    @Before
    public void setUp() throws Exception {
        tray = new Tray(0.50, 10);
    }

    //check trays have a price
    @Test
    public void testTrayPrice() {
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

    //check tray stock
    @Test
    public void testStockLevelZero() {
        assertEquals(0, tray.getStockLevel());
    }

    //check we can add an item to a tray
    @Test
    public void testCanAddItem() {
        Drink drink = new Drink("Ice Tea", 500);
        tray.addItem(drink);
        assertEquals(1, tray.getStockLevel());
    }

    //check we can remove an item from a tray
    @Test
    public void testTrayEjectsItem() {
        Drink drink1 = new Drink("Ice Tea", 500);
        tray.addItem(drink1);
        Drink ejectedDrink = (Drink) tray.ejectProduct();
        assert(ejectedDrink instanceof Drink);
    }

    //check we cannot add items beyond a tray's capacity
    @Test
    public void testTrayCannotExceedCapacity() {
        for(int i = 0; i < 11; i++){
            Drink drink = new Drink("Irn Bru", 330);
            tray.addItem(drink);
        }
        assertEquals(10, tray.getStockLevel());
    }
}
