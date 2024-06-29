//https://leetcode.com/problems/flipping-an-image/
package ArraysPractice;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={ {1,1,0},
                        {1,0,1},
                        {0,0,0}};
        int[][] ans=flipAndInvertImage(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length ; j++) {
                ans[i][image[i].length-1-j]=image[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[i][j]==0){
                    ans[i][j]=1;
                }else {
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}
