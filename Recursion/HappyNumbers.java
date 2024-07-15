package Recursion;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (!seen.add(n)) {
                return false;
            }
            n = getNextNumber(n);
        }
        return true;
    }

    private static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 19;
        if (isHappy(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}