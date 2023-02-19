package JAVAMETHODS;

public class Overloading {
    /*
     * If two methods do the same thing but different parameters it is ok to overload one
     * Static in a method means it belongs to the class and is not an object
     * The math library can also be used without importation
     */
    static int plusMethod(int x, int y){
        return (int) Math.sqrt(x)+y;
    }
    // In java double is used in the place of float
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        int intAnswer = plusMethod(3, 0);
        double doubleAnswer = plusMethod(4.3, 5.2);

        System.out.println("int response:"+intAnswer);
        System.out.println("double response:"+doubleAnswer);


    }
}
