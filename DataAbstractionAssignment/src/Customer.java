import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private double checkDeposit;
    private double savingDeposit;


    //Arraylists of deposits and withdraws
    static ArrayList<Deposit> deposit = new ArrayList<>();
    static ArrayList<Withdraw> withdraw = new ArrayList<>();

    Customer(){
        //create default constructor
        accountNumber = 1;
        deposits = deposit;
        withdraws = withdraw;
        savingBalance = 0;
        checkBalance = 0;
        name= "";

    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkDeposit = checkDeposit;
        this.savingDeposit = savingDeposit;
    }

    //Requires: amt >= 0
    //Modifies: this, deposits
    //Effects: adds amt to balance of account (SAVING or CHECKING) and adds a new Deposit object to deposit arraylist
    public double deposit(double amt, Date date, String account){
        //your code here
        if (amt >=0){

        if (account ==CHECKING){
            //make a new object for every deposit and put that object into the deposit arraylist
            deposit.add(new Deposit(amt, date,CHECKING));
        checkBalance = amt + checkBalance;
            }
        else if (account == SAVING){
            //make a new object for every deposit and put that object into the deposit arraylist
            deposit.add(new Deposit(amt, date,SAVING));
            savingBalance = amt + savingBalance;
            }
        }
        return 0;
    }

    //Requires: amt >=0
    //Modifies: this, withdraws
    //Effects: subtracts amt from balance of account and adds a new Withdraw object to withdraw arraylist, prevents withdrawals from exceeding overdraft

    public double  withdraw(double amt, Date date, String account){
        //your code here
        if (amt >= 0 && !checkOverdraft(amt, account)){

    if (account == CHECKING){
        checkBalance = checkBalance - amt;
        //add a new withdraw object
        withdraw.add(new Withdraw(amt, date,CHECKING));

    }
    else if (account == SAVING){
        savingBalance = savingBalance - amt;
        //make a new object for every withdraw and put that object into the deposit arraylist
        withdraw.add(new Withdraw(amt, date,SAVING));

    }
}
        return 0;
    }

    //Checks if customer has exceeded overdraft
    private boolean checkOverdraft(double amt, String account){
        //your code here
        //Returns true if Customer withdraws an amount from an account and exceeds overdraft
        if (account == SAVING && savingBalance - amt < OVERDRAFT){
            return true;
        }
     else if (account == CHECKING && checkBalance - amt < OVERDRAFT){
            return true;
        }
        return false;
    }


    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }


// getters and setters

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public static ArrayList<Deposit> getDeposit() {
        return deposit;
    }

    public static void setDeposit(ArrayList<Deposit> deposit) {
        Customer.deposit = deposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {
        this.withdraws = withdraws;
    }

    //does the same thing as the method "displayDeposits"
    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCHECKING() {
        return CHECKING;
    }

    public static String getSAVING() {
        return SAVING;
    }

    public int getOVERDRAFT() {
        return OVERDRAFT;
    }

    public double getCheckDeposit() {
        return checkDeposit;
    }

    public void setCheckDeposit(double checkDeposit) {
        this.checkDeposit = checkDeposit;
    }

    public double getSavingDeposit() {
        return savingDeposit;
    }

    public void setSavingDeposit(double savingDeposit) {
        this.savingDeposit = savingDeposit;
    }

    public static ArrayList<Withdraw> getWithdraw() {
        return withdraw;
    }

    public static void setWithdraw(ArrayList<Withdraw> withdraw) {
        Customer.withdraw = withdraw;
    }
}
