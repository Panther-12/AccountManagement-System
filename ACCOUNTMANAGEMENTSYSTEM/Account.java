package ACCOUNTMANAGEMENTSYSTEM;
import java.util.Scanner;

// INTERFACE: Groups all account related actions
// METHODS: Common account methods clustered under a single interface
interface AccountMethods{
    public void depositMoney();
    public void withdrawMoney();
    public void transferMoney(String accountNumber);
    public void checkBalance();
    public int createAccount(String accName, String password, String phoneNumber);
    public int loginToAccount(String password, String accNo);
}

interface CommonAccountDetails{
    public void setPassword();
    public String getPassword();
}

// CLASS: NewAccount class contains account details common for all accounts
// ENCAPSULATION: Some of the account details eg. password are protected
// ATTRIBUTES: Overdraft and balance are characteristics of the NewAccount class inherited by the sub classes
class NewAccount implements AccountMethods, CommonAccountDetails{
    final double overdraft = 50000.00;
    public double balance = 0.0;

    // Define the input
    Scanner input = new Scanner(System.in);
    
    // METHODS: createAccount(), depositMoney(), withdrawMoney() etc are actions that can be performed when accessing
    // an account
    public int createAccount(String accName, String password, String phoneNumber){
        System.out.println("Provide the required details to continue");
        return 0;
    }

    // Account actions
    public void depositMoney(){
        System.out.println("Enter Amount:");
        double amount = input.nextDouble();
        balance+=amount;
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount:");
        double amount = input.nextDouble();
        if(balance<=0.00){
            while(amount>overdraft){
                System.out.println("An overdraft of at most 50000.00 is allowed. Try a lower amount");
                amount = input.nextDouble();
            }
            if(balance> -overdraft){
                if(balance+(-amount) < -overdraft){
                    System.out.println("Amount exceeds the overdraft limit try a lower amount");
                }
                balance-=amount;
            }
            else{
                System.out.println("You have exhausted your overdraft amount");
            }
        }
        else{
            if(balance-amount >= -overdraft){
                balance-=amount;
            }
            else{
                System.out.println("Amount greater than the overdraft amount");
            }
    }
    }
    public void transferMoney(String accountNumber){}
    public void checkBalance(){
        System.out.println("Account balance:"+balance);
    }

    // account details
    public void setPassword(){};
    public String getPassword(){
        return "";
    };

    // login functionality
    public int loginToAccount(String password, String accNo){
        return 0;
    }
}

// public class Account {
//     public static void main(String[] args){
//         // NewAccount account = new NewAccount();
//     }
// }
