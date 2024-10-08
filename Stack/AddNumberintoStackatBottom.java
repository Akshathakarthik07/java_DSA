package Stack;
import java.util.Stack;

public class AddNumberintoStackatBottom {
    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, x);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        insertAtBottom(stack, 5);

        System.out.println(stack);
    }
}
