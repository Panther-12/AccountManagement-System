package JAVAMETHODS;

public class Student {
    // Methods include the normal brackets
    // Adding a java file in a folder causes java to identify it as a package

    /*
     * Parameters can be passed to the method. Multiple parameters are allowed separeted by a comma
     */
    static void firstMethod(String fullName){
        System.out.println("Hello"+fullName);
    }

    // Return values are allowed but the method must specify the type
    static int addNumbers(int y){
        return 4+y;
    }

    public static void main(String[] args){
        int answer = addNumbers(6);

        firstMethod("Nimrod nyongesa");
        System.out.println(answer);
    }
}
