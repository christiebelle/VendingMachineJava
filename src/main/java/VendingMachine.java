import java.util.HashMap;

public class VendingMachine {

    HashMap<Selection, Tray> products;
    private double credit;
    private double cash;

    public VendingMachine(HashMap<Selection, Tray> products, double cash) {
        this.products = products;
        this.cash = cash;
        this.credit = credit;
    }
}
