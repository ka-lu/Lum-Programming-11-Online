import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: An instance of Customer class to withdraw an amount greater or equal to 0 dollars
    //Modifies: this
    //Effects: returns the amt withdrawn from account (SAVINGS or CHECKING) and the date
    public String toString(){
        //your code here
        return "\nWithdraw:\n\nWithdraw of:$" + this.amount + " Date:" + this.date + " into account:" + this.account;
    }
}