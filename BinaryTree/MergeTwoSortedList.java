package BinaryTree;
import java.util.*;
public class MergeTwoSortedList {
    public static List<Integer> mergeList(List<Integer> arr1,List<Integer> arr2, int i,int j) {
        List<Integer> result = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                result.add(arr1.get(i));
                i++;
            } else {
                result.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            result.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            result.add(arr2.get(j));
            j++;
        }
        return result;
    }
        public static void main(String[] args) {
            List<Integer> arr1 = Arrays.asList(1, 2, 4);
            List<Integer> arr2 = Arrays.asList(1, 3, 4);
            List<Integer> result = mergeList(arr1, arr2, 0, 0);
            System.out.println(result);
        }
}
