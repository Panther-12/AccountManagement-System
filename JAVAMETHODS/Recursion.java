package JAVAMETHODS;

public class Recursion {
    // Its a technique of making a function call itself, breaking complex problems into simple problems
    public static void main(String[] args){
        int answer = sum(10);
        System.out.println(answer);
    }
    
    // return x+sum(x-1) takes the return value and adds it to the next return value
    public static int sum(int x){
        if(x>0){
            return x+sum(x-1);
        }
        else{
            return 0;
        }
    }
}
