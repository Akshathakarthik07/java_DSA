package Recursion;

public class Factorial {
    public static void main(String args[]){
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
