package Stack;
import java.util.Stack;

public class NextGreater {
    public static Stack<Integer> stack = new Stack<>();

    public static void stackLogic(int[] arr, int[] ans, Stack<Integer> stack, int i) {
        if (i < 0) {
            return;
        }
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            ans[i] = -1;
        } else {
            ans[i] = stack.peek();
        }
        stack.push(arr[i]);
        stackLogic(arr, ans, stack, i - 1);
    }

    public static void main(String args[]) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] ans = new int[arr.length];
        stackLogic(arr, ans, stack, arr.length - 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
