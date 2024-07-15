package GeneralCode;

public class MissingNumberofArray {
    public static void main(String args[]){
            int[] arr = {3,0,1};
            int n = arr[0];
            int expected_sum = n*(n+1)/2;
            int act_sum = 0;
            for(int i = 0; i< arr.length;i++){
                act_sum = act_sum+arr[i];
            }
            int missing_value = expected_sum - act_sum;
            System.out.println(missing_value);
    }
}
