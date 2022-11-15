import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {
        BankAccount Account001 = new BankAccount("Ann", "A", LocalDate.of(1970,1,2), 001, 200.0, "Savings Account");
        BankAccount Account002 = new BankAccount("Bob", "B", LocalDate.of(1982, 2,5), 002,211.0, "Current Account");
        BankAccount Account003 = new BankAccount("Catty", "C", LocalDate.of(1995, 3, 8), 003, 5550.0, "Savings Account");

    }


}
