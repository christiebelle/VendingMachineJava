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

    public double getCash() {
        return cash;
    }

    public double getCredit() {
        return credit;
    }

    public void addMoney(double amountEntered) {
        credit += amountEntered;
    }

    public double giveRefund() {
        //figure out how much credit there is in the machine
        double refundAmount = this.credit;
        //reset the credit variable
        this.credit = 0;
        //return that amount back out of the function
        return refundAmount;
    }

    public int getStockLevelForTray(Selection selection) {
        return products.get(selection).getStockLevel();
    }

    public Product vend(Selection selection) {
        Tray selectedTray = products.get(selection);
        Product product = null;

        //check credit is greater than or equal to the price of the row
        if (credit >= selectedTray.getPrice()) {
            //check product is in stock in row
            if (selectedTray.getStockLevel() > 0) {
                //get product from tray
                product = selectedTray.ejectProduct();
                //move credit to cash
                cash += selectedTray.getPrice();
                //credit goes down
                credit -= selectedTray.getPrice();
            }
        }
        //return the product
        return product;
    }
}