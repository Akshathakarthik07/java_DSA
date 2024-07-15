package Recursion;

public class FibbanocciNumber {
    public static void main(String[] args){
        int n = 6;
        System.out.println(fibRecursion(n));
    }
    public static int fibRecursion(int n){
        if(n==0||n==1){
            return n;
        }
        int fmn1 = fibRecursion(n-1);
        int fmn2 = fibRecursion(n-2);
        int fn = fmn1+fmn2;
        return fn;
    }
}
