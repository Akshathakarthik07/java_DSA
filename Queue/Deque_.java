package Queue;
import java.util.*;
public class Deque_{
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.addLast(1);
        d.addFirst(2);
        d.addLast(3);
        d.addFirst(4);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
