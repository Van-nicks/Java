//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package ArraysPractice;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            int no=nums[i];
            int rem=0;
            while(no>0){
                rem++;
                no=no/10;
            }
            if (rem%2==0){
                count++;
            }
        }
        return count;
    }
}
