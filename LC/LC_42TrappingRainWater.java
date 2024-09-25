/*package LC;

public class LC_42TrappingRainWater {
    public static  void main(String[] args){
        int[] arr = {3,0,1,0,4,0,2};
        int start = arr[0];
        int end, endidx = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] >= start){
                end = arr[i];
                endidx = i;
            }
        }
        int mat1 = start * start;
        int count1 = 0;
        for(int i = 1; i < endidx; i++){
            count1 += arr[i];
        }
        int total1 = mat1 - count1;
        System.out.print(total1);
        int minstart = arr[arr.length - 1];
        int minidx = arr.length - 1;
        int count2 = 0;
        int mat2 = minstart * minstart;
        for(int i = endidx + 1; i < minidx; i++){
            count2 += arr[i];
        }
        int total2 = mat2 - count2;
        int grand = total1 + total2;
        System.out.print(grand);
    }

}*/
/*package LC;

public class LC_42TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int start = arr[0];
        int end = start;
        int endidx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= start) {
                end = arr[i];
                endidx = i;
                break;
            }
        }
        int total1 = 0;
        for (int i = 1; i < endidx; i++) {
            total1 += Math.max(0, start - arr[i]);
        }
        System.out.println("Water trapped on left: " + total1);
        int minstart = arr[arr.length - 1];
        int minidx = arr.length - 1;
        int total2 = 0;
        for (int i = endidx + 1; i < minidx; i++) {
            total2 += Math.max(0, minstart - arr[i]);
        }
        int grandTotal = total1 + total2;
        System.out.println("Grand Total Water Trapped: " + grandTotal);
    }
}*/
/*package LC;

public class LC_42TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int start = arr[0];
        int end = start;
        int endidx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= start) {
                end = arr[i];
                endidx = i;
                break;
            }
        }
        int total1 = 0;
        for (int i = 1; i < endidx; i++) {
            total1 += Math.max(0, start - arr[i]);
        }


        int minstart = arr[arr.length - 1];
        int minidx = arr.length - 1;

        int total2 = 0;
        for (int i = endidx + 1; i < minidx; i++) {
            total2 += Math.max(0, minstart - arr[i]);
        }
        int grandTotal = total1 + total2;
        System.out.println("Grand Total Water Trapped: " + grandTotal);
    }
}
*/
package LC;

public class LC_42TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left <= right) {

            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    totalWater += leftMax - arr[left];
                }
                left++;
            }
            else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    totalWater += rightMax - arr[right];
                }
                right--;
            }
        }

        System.out.println("Total Water Trapped: " + totalWater);
    }
}
