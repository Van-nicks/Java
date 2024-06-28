//https://leetcode.com/problems/find-the-highest-altitude/
package ArraysPractice;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        int sum=0;
        for (int i=0; i<ans.length; i++){
            if (i==0){
                ans[i]=sum;
            }else {
                sum+=gain[i-1];
                ans[i]=sum;
            }
        }
        int max=ans[0];
        for (int i=1; i< ans.length; i++){
            if (max<ans[i]){
                max=ans[i];
            }
        }
        return max;
    }
}
