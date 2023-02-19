package ACCOUNTMANAGEMENTSYSTEM;
import java.util.Scanner;
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.*;

public class Main {
    private static int checkOption(){
        System.out.println("ENTER CHOICE:");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        return option;
    }
    private static void printFirstMenu(){
        System.out.println("Welcome to the Banking System");
        System.out.println("1. Current Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.println("3. Savings Account");
    }
    public static void accountActions(CurrentAccount nimrod){
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        while(!exit){
            System.out.println("Select from the menu below.\n 1. Deposit\n 2. Withdraw\n 3. Check balance\n 4. Exit");
            int option = input.nextInt();
            // input.close();


            if(option == 1){
                nimrod.depositMoney();
            }
            if(option == 2){
                nimrod.withdrawMoney();
            }
            if(option == 3){
                nimrod.checkBalance();
            }
            if(option == 4){
                exit = true;
            }
        }
    }
    public static void main(String[] args){

        // User logs into their account
        // Select the type of account you want to log in to 
        /*
         * 1. Current account
         * 2. Fixed deposit account
         * 3. Savings account
         */
        printFirstMenu();
        checkOption();
        System.out.println("The above functionality is still under development");

        // OBJECT: Instance of CurrentAccount class
        CurrentAccount nimrod = new CurrentAccount();
        // ArrayList<String> accounts = new ArrayList<String>();

        // Check for registration or login 
        System.out.println("Select from the options below \n 1. Register an account \n 2. Login \n 3. Exit");
        Scanner input = new Scanner(System.in);

        int accountOption = input.nextInt();

        switch (accountOption) {
            case 1:
                int newUser = nimrod.createAccount("INTOTHEVERSE", "23JK2H2J42JK", "0740837666");
                if(newUser == 1){
                    System.out.println("Account created successfully");
                }
                /* 
                METHOD OVERLOADING: accountActions method takes user object as an argument which contains different values
                                    as compared to the same method used in case 2.
                 */
                accountActions(nimrod);
                // System.out.println("Your password is:"+nimrod.password);
                break;
            case 2:
                int newLogin = nimrod.loginToAccount("23JK2H2J42JK", "CU3456");
                if(newLogin == 1){
                    System.out.println("Logged in successfully. Welcome"+nimrod.accountName);
                }
                accountActions(nimrod);
                break;
            default:
                break;
        }
        input.close();
    }
}
