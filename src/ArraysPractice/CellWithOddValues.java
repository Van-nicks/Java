//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
package ArraysPractice;

public class CellWithOddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices={   {0,1},
                            {1,1}};
        System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] result=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                result[indices[i][0]][j]++;
            }
            for (int k = 0; k < m; k++) {
                result[k][indices[i][1]]++;
            }
        }
        int ans=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j]%2!=0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
