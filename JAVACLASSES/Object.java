package JAVACLASSES;

public class Object {
    // similar to constant in python
    final String name = "Nimrod";
    
    //  create an object from the class Object
    public static void main(String[] args){
        Object person = new Object();
        // contents of the object can be accessed similar to python classes
        System.out.println(person.name);
    }
}
