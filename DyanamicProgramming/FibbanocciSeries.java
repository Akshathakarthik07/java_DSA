package DyanamicProgramming;
public class FibbanocciSeries {
    //topdown approach
    public static int fibRecursion(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        int fmn1 = fibRecursion(n - 1,arr);
        int fmn2 = fibRecursion(n - 2,arr);
        int fn = fmn1 + fmn2;
        arr[n]=fn;
        return fn;
    }
    public static void main(String[] args){
        int n = 45;
        int[] arr = new int[n+1];
        int ans = fibRecursion(n,arr);
        System.out.println(ans);
    }
}
