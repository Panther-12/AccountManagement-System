package JAVACLASSES;

// Protected: The attributes are accessed in the subclasses
// Private: The attributes and methods are accessed within the class it is defined
public class Inheritance {
    public static void main(String[] args){
        FixedAccount myAccount = new FixedAccount();
        myAccount.getAccountName();
    }
}
class Accounts{
    protected String accountName = "ACRFFJGJDE";
    private String password ="784uhr49uf0n48";

    public void getAccountName(){
        System.out.println(this.accountName);
        System.out.println("password:"+password);
    }
}
class FixedAccount extends Accounts{
    private String fAccountName = "F90UHG8G";
    public String printName(){
        return fAccountName;
    }
}
