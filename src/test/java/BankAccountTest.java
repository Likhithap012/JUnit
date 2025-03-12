import com.gevernova.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void testDeposit(){
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(10);
        assertEquals(10,bankAccount.getBalance());
    }

    @Test
    void testWithDraw(){
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(10);
        bankAccount.withdraw(10);
        assertEquals(0,bankAccount.getBalance());
    }

    @Test
    void testWithDrawWithInsufficientFunds(){
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(10);
        assertThrows(IllegalArgumentException.class,()->bankAccount.withdraw(100));
    }

}
