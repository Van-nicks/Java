//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {4,2,1,1};
        int[] index = {0,0,2,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ans=new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
                ans[i]= list.get(i);
        }
        return ans;
    }
}
