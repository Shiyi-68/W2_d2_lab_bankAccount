import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount BA;

    @BeforeEach
    public void setUp(){
        BA = new BankAccount("Ann", "A", LocalDate.of(1970, 1, 2), 001, 200.0, "Savings Account");

    }

    @Test
    public void hasFirstName(){
        assertThat(BA.getFirstName()). isEqualTo("Ann");
    }

    @Test
    public void canSetFirstName(){
        BA.setFirstName("Bob");
        assertThat(BA.getFirstName()). isEqualTo("Bob");
    }

    @Test
    public void hasLastName(){
        assertThat(BA.getLastName()). isEqualTo("A");
    }

    @Test
    public void canSetLastName(){
        BA.setLastName("B");
        assertThat(BA.getLastName()). isEqualTo("B");
    }

    @Test
    public void hasDateOfBirth(){
        assertThat(BA.getDateOfBirth()). isEqualTo(LocalDate.of(1970, 1,2));
    }

    @Test
    public void canSetDateOfBirth(){
        BA.setDateOfBirth(LocalDate.of(1982, 2, 5));
        assertThat(BA.getDateOfBirth()). isEqualTo(LocalDate.of(1982,2,5));
    }

    @Test
    public void hasAccountNumber(){
        assertThat(BA.getAccountNumber()). isEqualTo(001);
    }

    @Test
    public void canSetAccountNumber(){
        BA.setAccountNumber(002);
        assertThat(BA.getAccountNumber()). isEqualTo(002);
    }

    @Test
    public void hasBalance(){
        assertThat(BA.getBalance()). isEqualTo(200.0);
    }

    @Test
    public void canSetBalance(){
        BA.setBalance(888.0);
        assertThat(BA.getBalance()). isEqualTo(888.0);
    }

    @Test
    public void hasAccountType(){
        assertThat(BA.getAccountType()). isEqualTo("Savings Account");
    }

    @Test
    public void canSetAccountType(){
        BA.setAccountType("Current Account");
        assertThat(BA.getAccountType()). isEqualTo("Current Account");
    }

    @Test
    public void canDeposit(){
        String actual = BA.deposit(500.0);
        String expected = "The balance after deposit is: 700.0";
        assertThat(actual). isEqualTo(expected);
    }

    @Test //test that it could do the subtraction
    public void canWithdrawal1(){
        String actual = BA.withdrawal(100.0);
        String expected = "The balance after withdrawal is: 100.0";
        assertThat(actual). isEqualTo(expected);
    }

    @Test //test that when amount exceeds current amount, show failure note instead.
    public void canWithdrawal2(){
        String actual = BA.withdrawal(300.0);
        String expected = "The balance after withdrawal is: 200.0. Note: withdrawal failed. Type in a smaller amount.";
        assertThat(actual). isEqualTo(expected);
    }

    @Test //situation 1: Savings Account
    public void canPayInterest1(){
        String actual = BA.payInterest("Savings Account");
        String expected = "You need to pay 6.0 as interest.";
        assertThat(actual). isEqualTo(expected);
    }

    @Test //situation 2: Current Account
    public void canPayInterest2(){
        String actual = BA.payInterest("Current Account");
        String expected = "You need to pay 2.0 as interest.";
        assertThat(actual). isEqualTo(expected);
    }
}
