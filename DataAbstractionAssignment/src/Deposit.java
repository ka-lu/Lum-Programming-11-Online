import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: An instance of Customer class to deposit an amount greater or equal to 0 dollars
    //Modifies: this
    //Effects: returns the amt deposited to account (SAVINGS or CHECKING) and the date
    public String toString(){
        //your code here
        return "\nDeposit:\n\nDeposit of:$" + this.amount + " Date:" + this.date + " into account:" + this.account;
    }
}
