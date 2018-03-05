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

    @Test
    public void testCanGiveRefund() {
        vendingMachine.addMoney(1.50);
        double refunded = vendingMachine.giveRefund();

        assertEquals(0.00, vendingMachine.getCredit(), 0.01);
        assertEquals(10.00, vendingMachine.getCash(), 0.01);
        assertEquals(1.50, refunded, 0.01);
    }

    @Test
    public void testStockLevelOfTray() {
        assertEquals(5, vendingMachine.getStockLevelForTray(Selection.A1));
    }


    @Test
    public void testVend() {
        //check stock inventory on tray goes down
        //check credit sets to zero
        //check credit amount adds to cash
        //check item is returned
        vendingMachine.addMoney(0.50);
        Product product = vendingMachine.vend(Selection.A1);

        assertEquals(4, vendingMachine.getStockLevelForTray(Selection.A1));
        assertEquals(10.50, vendingMachine.getCash(), 0.01);
        assertEquals(00.00, vendingMachine.getCredit(), 0.01);
        assert(product instanceof Product);
    }

    @Test
    public void testCustomersRetainsCreditWhenOutOfStock() {
        vendingMachine.addMoney(10.00);

        for(int i = 0; i < 5; i ++){
            vendingMachine.vend(Selection.A1);
        }
        assertEquals(7.50, vendingMachine.getCredit(), 0.01);
    }
}
