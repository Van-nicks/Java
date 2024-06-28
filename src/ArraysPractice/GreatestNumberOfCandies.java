//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(new List[]{kidsWithCandies(candies, extraCandies)}));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        for (int i=0; i<candies.length; i++){
            int ans=candies[i]+extraCandies;
            boolean option=false;
            int j=0;
            while (j<candies.length){
                if (ans>=candies[j]){
                    option=true;
                }else{
                    option=false;
                    break;
                }
                j++;
            }
            result.add(option);
        }
        return result;
    }
}
