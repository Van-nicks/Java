//https://leetcode.com/problems/shuffle-the-array/
package ArraysPractice;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=0;
        for (int i=0; i<ans.length; i++){
            if(i%2==0){
                ans[i]=nums[j];
                j++;
            }else{
                ans[i]=nums[n];
                n++;
            }
        }
        return ans;
    }
}
