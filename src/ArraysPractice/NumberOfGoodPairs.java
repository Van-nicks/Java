//https://leetcode.com/problems/number-of-good-pairs/description/
package ArraysPractice;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int ans=0;
        for (int i=0; i<nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
