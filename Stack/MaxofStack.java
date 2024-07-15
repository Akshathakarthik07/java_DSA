package Stack;
import java.util.Stack;

public class MaxofStack {
    public static Stack<Integer> stack = new Stack<>();

    public static void maxofStack(Stack<Integer> stack, int i, int ans) {
        if (i == stack.size()) {
            System.out.println(ans);
            return;
        }
        if (ans < stack.get(i)) {
            ans = stack.get(i);
        }
        maxofStack(stack, i + 1, ans);
    }

    public static void main(String args[]) {
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(6);
        maxofStack(stack, 0, stack.get(0));
    }
}
