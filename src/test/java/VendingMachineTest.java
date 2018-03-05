import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() throws Exception {
        HashMap<Selection, Tray> products = new HashMap();

        for (Selection selection : Selection.values()) {
            Tray tray = new Tray(0.50, 10);
            for (int i = 0; i < 5; i++) {
                Sweet refreshers = new Sweet("Refreshers", 10);
                tray.addItem(refreshers);
            }
            products.put(selection, tray);

            vendingMachine = new VendingMachine(products, 10.00);
        }
    }

    @Test
    public void testAddCoins() {
    vendingMachine.addMoney(0.50);

    assertEquals(10.00, vendingMachine.getCash(), 0.01);
    assertEquals(0.50, vendingMachine.getCredit(), 0.01);

    }
}
