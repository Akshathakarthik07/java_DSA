package LC;

public class LC1492_TheKthFactorofN {
    public static int kthFactor(int n, int k) {
        int sqrt = (int) Math.sqrt(n);
        int count = 0;
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        for (int i = sqrt; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                count++;
                if (count == k) {
                    return n / i;
                }
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int n = 12;
        int k = 4;
        int result = kthFactor(n,k);
        System.out.println(result);
    }
}

