import java.time.LocalDate;

public class BankAccount {

    //Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private Double balance;
    private String accountType;

    //Constructor
    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber, Double inputBalance, String inputAccountType){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
        this.accountType = inputAccountType;
    }

    //Methods
    public String deposit(Double amount){
        balance += amount;
        return "The balance after deposit is: " + balance;
    }

    public String withdrawal(Double amount){
        String result = null;
        if(balance >= amount){
            balance -= amount;
        } else{
            result = " Note: withdrawal failed. Type in a smaller amount.";
        }
        return "The balance after withdrawal is: " + balance + "." + result;
    }

    public String payInterest(String accountType){
        Double interest_amount = null;
        if (accountType == "Savings Account"){
            interest_amount = balance * 3 / 100;
        } else if(accountType == "Current Account"){
            interest_amount = balance * 1 / 100;
        }
        return "You need to pay " + interest_amount + " as interest.";
    }

    //Getters & setters
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(Double newBalance){
        this.balance = newBalance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }

}
