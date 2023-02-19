package JAVACLASSES;

// To make sure sensitive data hidden from users
public class Encapsulation {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args){
        Encapsulation encap = new Encapsulation();
        encap.name = "nimrod";

        System.out.println(encap.name);
    }
}
