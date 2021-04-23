import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer testCustomer;
    java.util.Date date = new java.util.Date();

    @Before
    public void setup(){
        testCustomer = new Customer();
    }

    //Resets testCustomer's deposit and withdraw arraylists so tests will pass when ran altogether and individually
    @After
    public void teardown(){
        for (int i = 0; i < Customer.deposit.size(); i ++){
                testCustomer.getDeposits().remove(0);
        }
        for (int j = 0; j < Customer.withdraw.size(); j++){
            testCustomer.getWithdraws().remove(0);
        }
    }

    @Test
    public void testWithdrawPositiveAmountSavings(){
        //0 withdrawals and deposits from savings account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(),0);
        //100.00 dollars deposited to savings account
        testCustomer.deposit(100.0,date,Customer.SAVING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing an amount greater or equal to zero
        testCustomer.withdraw(50.0,date,Customer.SAVING);
        assertEquals(Customer.withdraw.size(), 1);
    }

    @Test
    public void testWithdrawAmountNotExceedingOverdraftSavings(){
        //0 withdrawals and deposits from savings account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(),0);
        //100.00 dollars deposited to savings account
        testCustomer.deposit(100.0,date,Customer.SAVING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing an amount which does not exceed overdraft
        testCustomer.withdraw(200.0,date,Customer.SAVING);
        assertEquals(Customer.withdraw.size(), 1);
    }

    @Test
    public void testWithdrawNegativeAmountSavings (){
        //0 withdrawals or deposits from savings account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(), 0);
        //Deposit 100.0 dollars to savings account
        testCustomer.deposit(100.0,date,Customer.SAVING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing negative amount from savings
        testCustomer.withdraw(-20.0,date,Customer.SAVING);
        assertEquals(Customer.withdraw.size(), 0);
    }

    @Test
    public void testWithdrawAmountExceedingOverdraftSaving(){
        //0 withdrawals or deposits from savings account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(), 0);
        //Deposit 100.0 dollars to savings account
        testCustomer.deposit(100.0,date,Customer.SAVING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing amount greater than overdraft from savings account
        testCustomer.withdraw(300.0,date,Customer.SAVING);
        assertEquals(Customer.withdraw.size(),0);

    }

@Test
public void testWithdrawAmountOverZeroChecking(){
        //0 withdraws or deposits from checking account
        assertEquals(Customer.withdraw.size(),0);
        assertEquals(Customer.deposit.size(),0);
        //100.0 deposited to checking account
        testCustomer.deposit(100.0,date,Customer.CHECKING);
        assertEquals(Customer.deposit.size(),1);
        //customer withdrawing a positive amount fromm checking account
        testCustomer.withdraw(10.0,date,Customer.CHECKING);
        assertEquals(Customer.withdraw.size(),1);
}

    @Test
    public void testWithdrawAmountNotExceedingOverdraftChecking(){
        //0 withdrawals or deposits from checking account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(), 0);
        //100.00 dollars deposited to checking account
        testCustomer.deposit(100.0,date,Customer.CHECKING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing an amount which does not exceed overdraft
        testCustomer.withdraw(200.0,date,Customer.CHECKING);
        assertEquals(Customer.withdraw.size(), 1);
    }

    @Test
    public void testWithdrawNegativeAmountChecking (){
        // 0 withdrawals or deposits from checking account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(), 0);
        //Deposit 100.0 dollars to checking account
        testCustomer.deposit(100.0,date,Customer.CHECKING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing negative amount from checking account
        testCustomer.withdraw(-20.0,date,Customer.CHECKING);
        assertEquals(Customer.withdraw.size(), 0);
    }

    @Test
    public void testWithdrawAmountExceedingOverdraftChecking(){
        // 0 withdrawals or deposits from checking account
        assertEquals(Customer.withdraw.size(), 0);
        assertEquals(Customer.deposit.size(), 0);
        //Deposit 100.0 dollars to checking account
        testCustomer.deposit(100.0,date,Customer.CHECKING);
        assertEquals(Customer.deposit.size(), 1);
        //Customer withdrawing amount exceeding overdraft from checking account
        testCustomer.withdraw(300.0,date,Customer.CHECKING);
        assertEquals(Customer.withdraw.size(),0);
    }

    @Test
    public void testDepositPositiveAmountSavings (){
        //No deposits to savings account
        assertEquals(Customer.deposit.size(),0);
        //Customer depositing positive amount of $80.00 to savings account
        testCustomer.deposit(80.0,date,Customer.SAVING);
        //1 deposit was made to savings account
        assertEquals(Customer.deposit.size(),1);
    }

    @Test
    public void testDepositNegativeAmountSavings (){
        //No deposits to savings account
        assertEquals(Customer.deposit.size(),0);
        //Customer depositing negative amount to savings account
        testCustomer.deposit(-20.0,date,Customer.SAVING);
        //0 deposits was made to savings account
        assertEquals(Customer.deposit.size(),0);
    }

    @Test
    public void testDepositPositiveAmountChecking (){
        //No deposits to checking account
        assertEquals(Customer.deposit.size(),0);
        //Customer depositing positive amount of $50.00 to checking account
        testCustomer.deposit(50.0,date,Customer.CHECKING);
        //1 deposit was made to checking account
        assertEquals(Customer.deposit.size(),1);
    }

    @Test
    public void testDepositNegativeAmountChecking (){
        //0 deposits are made to checking account
        assertEquals(Customer.deposit.size(),0);
        //Customer depositing negative amount to checking account
        testCustomer.deposit(-20.0,date, Customer.CHECKING);
        //0 deposits was made to checking account
        assertEquals(Customer.deposit.size(),0);
    }

    @Test
    public void testWithdrawToStringSavings (){
        //Customer deposit a positive amount to savings account
        assertEquals(Customer.deposit.size(),0);
        testCustomer.deposit(100.0,date, Customer.SAVING);
        assertEquals(Customer.deposit.size(),1);
        //withdraw a positive amount from savings account
        assertEquals(Customer.withdraw.size(), 0);
        testCustomer.withdraw(50.0,date, Customer.SAVING);
        assertEquals(Customer.withdraw.size(), 1);
        //Display all withdraws
        testCustomer.displayWithdraws();
    }

    @Test
    public void testWithdrawToStringChecking(){
        //Customer deposit a positive amount to checking account
        assertEquals(Customer.deposit.size(),0);
        testCustomer.deposit(100.0,date, Customer.CHECKING);
        assertEquals(Customer.deposit.size(),1);
        //withdraw a positive amount from checking account
        testCustomer.withdraw(50.0,date, Customer.CHECKING);
        assertEquals(Customer.withdraw.size(), 1);
        //Display all withdraws
        testCustomer.displayWithdraws();
    }

    @Test
    public void testDepositToStringSaving (){
        //Customer deposit a positive amount to savings account
        assertEquals(Customer.deposit.size(),0);
        testCustomer.deposit(100.0,date, Customer.SAVING);
        assertEquals(Customer.deposit.size(),1);
        //Display all withdraws
        testCustomer.displayDeposits();
    }

    @Test
    public void testDepositToStringChecking(){
        //Customer deposit a positive amount to checking account
        assertEquals(Customer.deposit.size(),0);
        testCustomer.deposit(100.0,date,Customer.CHECKING);
        assertEquals(Customer.deposit.size(),1);
        //Display all withdraws
        testCustomer.displayDeposits();
    }

}
