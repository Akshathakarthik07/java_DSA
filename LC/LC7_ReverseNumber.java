package LC;

public class LC7_ReverseNumber {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;
        }
        if(x<0){
            reversed *= -1;
        }
        else{
            reversed *= 1;
        }
        return reversed;
    }
    public static void main(String[] args){
        int x = -123;
        int result = reverse(x);
        System.out.print(result);
    }
}


