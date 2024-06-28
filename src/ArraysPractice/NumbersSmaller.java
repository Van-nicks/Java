//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
package ArraysPractice;

import java.util.Arrays;

public class NumbersSmaller {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
