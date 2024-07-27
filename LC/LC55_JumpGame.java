package LC;

public class LC55_JumpGame {
    public static boolean canJump(int[] nums) {
        int farthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= n - 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
