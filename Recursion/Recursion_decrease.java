package Recursion;

public class Recursion_decrease {
    public static void printDec(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        printDec(n+1);
        System.out.println(n);
        return;
    }
    public static void main(String args[]){
        printDec(1);
    }
}
