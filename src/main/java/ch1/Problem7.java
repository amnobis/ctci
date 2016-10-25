package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem7 {
   public static void main(String[] args) {
      int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++ j) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println();
      matrix = rotateMatrix(matrix);
      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++ j) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static int[][] rotateMatrix(int[][] matrix) {
      int n = matrix.length;

      for (int x = 0; x < n / 2; ++x) {
         for (int y = x; y < n - x - 1; ++ y) {
            int temp = matrix[x][y];

            matrix[x][y] = matrix[n-y-1][x];
            matrix[n-y-1][x] = matrix[n-x-1][n-y-1];
            matrix[n-x-1][n-y-1] = matrix[y][n-x-1];
            matrix[y][n-x-1] = temp;
         }
      }
      return matrix;
   }
}
