package LC;
import java.util.*;
public class LC412_FizzBuzz {
    static List<String> ans = new ArrayList<>();
    public static List<String> fizzBuzz(int n) {
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                ans.add("FizzBuzz");
            }
            else if(i%3 == 0){
                ans.add("Fizz");
            }
            else if(i%5 == 0){
                ans.add("Buzz");
            }
            else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n = 15;
        fizzBuzz(n);
        System.out.print(ans);
    }
}

