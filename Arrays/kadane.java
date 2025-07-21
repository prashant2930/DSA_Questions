package rec_String;

import java.util.*;

public class kadane {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int max = nums[0];
        int currsum=nums[0];
        for(int i = 1 ; i<nums.length;i++){
            currsum= Math.max(nums[i],currsum+nums[i]);
            max = Math.max(currsum,max);

        }
        return max;


    }
}
