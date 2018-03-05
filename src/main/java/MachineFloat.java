import java.util.HashMap;

public class MachineFloat {

    HashMap<Coins, Integer> kitty;

    public MachineFloat(HashMap<Coins, Integer> kitty) {
        this.kitty = kitty;
    }

    public HashMap<Coins, Integer> getFloatTotal() {
        return kitty;
    }
}
