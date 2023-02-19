package JAVACLASSES;

// Abstraction is used to achieve security - hide certain details and show only important details
// Abstraction can also be achieved using interfaces
abstract class Human{
    public abstract void sayName();
    public void eat(){
        System.out.println("mchew");
    }
}

class Person extends Human{
    // sub class must implement all abstract methods defined in the master class
    public void sayName(){
        System.out.println("im nimrod");
    }
}

// Objects cannot be created out of abstract classes so they must be extended by other classes
public class Abstraction{
    public static void main(String[] args){
        Person nimrod = new Person();
        nimrod.eat();
        nimrod.sayName();
    }
}