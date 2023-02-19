package JAVACLASSES;

// Group of specifically listed variables (constants)
public class Enum {
    enum Level{
        LOW,
        MEDIUM,
        HEIGHT
    }
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        for(Level var: Level.values()){
            System.out.println(var);
        }
    }
}
