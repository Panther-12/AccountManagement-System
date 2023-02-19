package ACCOUNTMANAGEMENTSYSTEM;
// import ACCOUNTMANAGEMENTSYSTEM.NewAccount;

// import java.util.ArrayList;
import java.util.Scanner;

// INHERITANCE: Each account type inherits methods and attributes from NewAccount class
// POLYMORPHISM: Each account type implements the methods withraw, deposit, transfer and check balance but with different parameters
class CurrentAccount extends NewAccount{
    // Account number is a random generated string with the account abbreviation at the start
    protected String accNumber = "CU"+"3456";
    public String accountName;
    protected String password;
    protected String phoneNo;

    Scanner input = new Scanner(System.in);

    // METHOD OVERRIDING
    @Override
    public int createAccount(String accName, String password, String phoneNumber){
        // super.createAccount();
        this.accountName = accName;
        this.password = password;
        this.phoneNo = phoneNumber;
        return 1;
        
    }

    @Override
    public int loginToAccount(String password, String accNo){
        if(password.equals(this.password) && accNo.equals(this.accNumber)){
            return 1;
        }
        return 0;
    }
    static void hello(){
        System.out.println("HELLO ACCOUNT USER");
    } 
}
class FixedAccount extends NewAccount{
    protected final double InterestRate = 4.0;
}
class SavingsAccount extends NewAccount{
    final double InterestRate = 3.5;
}


