package ArrayList;
import java.util.ArrayList;
public class ArrayListBasics1 {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        list.set(0,2);
        System.out.println(list.contains(3));
        System.out.println(list.contains(4));
        System.out.println(list.size());
    }
}
