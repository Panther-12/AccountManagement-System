package JAVACLASSES;
import java.util.ArrayList;


public class Arrays{
    //  Defining a normal array in java. Similar to c but the brackets are placed after type definition
    String[] accounts = {"nimrod"};
    ArrayList<String> accounts2 = new ArrayList<String>();

    // Methods involved using the above method
    // Returning an array includes the []. The default java array class does not have methods to manipulate items
    public String[] addItem(String itemName){
        return accounts;
    }

    public ArrayList<String> addToArrayList(String name){
        accounts2.add(name);
        accounts2.add(name);

        accounts2.get(1);
        accounts2.set(0, "james");
        System.out.println(accounts2);
        return accounts2;
    }
    public static void main(String[] args){
        Arrays acc = new Arrays();
        System.out.println(acc.addItem("nimrod")[0]);

        acc.addToArrayList("nimrod");
    }
}
