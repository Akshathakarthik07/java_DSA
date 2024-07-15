package GeneralCode;

public class NumberPower{
    public static void main(String[] args) {
        int num = 7;
        int n = 2;
        int total = numberPower(num, n);
        System.out.println(total);
    }

    public static int numberPower(int num, int n) {
        if (n == 0) {
            return 1;
        } else {
            return num * numberPower(num, n - 1);
        }
    }
}

