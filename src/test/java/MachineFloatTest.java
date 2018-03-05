import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MachineFloatTest {

    private MachineFloat machineFloat;
    HashMap<Coins, Integer> bank;


    @Before
    public void setUp() throws Exception {
        HashMap<Coins, Integer> bank = new HashMap<>();

        bank.put(Coins.TWOPOUND, 5);
        bank.put(Coins.ONEPOUND, 5);
        bank.put(Coins.FIFTY, 5);
        bank.put(Coins.TWENTY, 5);
        bank.put(Coins.TEN, 5);

        //Can this be done in a for loop?
    }

    //Test Float has money

//    @Test
//    public void testFloatHasMoney() {
//
//    }

    //Test can return Float total

    @Test
    public void testFloatTotal() {
        assertEquals(19.0, bank.getFloatTotal(), 0.01);
    }


    //Test can check amount of individual coins

    //Test can add to float

    //Test can remove from float

}
