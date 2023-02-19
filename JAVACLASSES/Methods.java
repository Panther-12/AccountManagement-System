package JAVACLASSES;
// import JAVACLASSES.Object;

public class Methods {
    // Static and public methods - static can be accessed without an object
    // public methods are accessible from a method
    public String printName(String name){
        return name;
    }

    static int printAge(int age){
        return age;
    }

    public static void main(String[] args){
        // Using a method with an access method

        Methods name = new Methods();
        Object newName = new Object();

        System.out.println(name.printName("NIMROD")+"object name:"+newName.name);

        int resultAge = printAge(21);
        System.out.println(resultAge);
    }
}
