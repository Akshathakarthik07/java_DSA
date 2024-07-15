package Stack;
import java.util.Stack;
public class StackBasicsreverseString {
    public static void main(String args[]){
        Stack<String> str = new Stack<>();
        String s1 = "hello";
        str.push(String.valueOf(s1.charAt(0)));
        str.push(String.valueOf(s1.charAt(1)));
        str.push(String.valueOf(s1.charAt(2)));
        str.push(String.valueOf(s1.charAt(3)));
        str.push(String.valueOf(s1.charAt(4)));
        System.out.println(str.pop());
        System.out.println(str.pop());
        System.out.println(str.pop());
        System.out.println(str.pop());
        System.out.println(str.pop());
    }
}
