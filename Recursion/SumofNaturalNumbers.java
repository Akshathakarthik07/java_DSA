package Recursion;

public class SumofNaturalNumbers {
    public static void main(String args[]){
        int n = 5;
        int sum = sumofNaturalNumber(n);
        System.out.println(sum);
    }
    public static int sumofNaturalNumber(int n){
        if(n == 1){
            return 1;
        }
        return n+sumofNaturalNumber(n-1);
    }
}
