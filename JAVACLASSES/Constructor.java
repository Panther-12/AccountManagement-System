package JAVACLASSES;

/*
 * Constructor is a special method used to initialize a constructor 
 * It is similar to python constructor def__init__(self, args...): self.name = name
 */
public class Constructor {
    String name;
    int age;

    public Constructor(){
        name = "nimrod";
        age = 20;
    }
    public static void main(String[] args){
        Constructor c = new Constructor();
        System.out.println("My name is :"+c.name+"Aged:"+c.age);
    }
}
