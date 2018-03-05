import java.util.ArrayList;

public class Customer {

    private final String name;
    private final int cash;
    private ArrayList<Product> inventory;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.inventory = new ArrayList<Product>();
    }

}
