package ch1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem8 {
   public static void main(String[] args) {
      int[][] matrix = new int[][]{{1,2,0,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++ j) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println();
      matrix = zenMatrix(matrix);
      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++ j) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static int[][] zenMatrix(int[][] matrix) {
      List<Coord> coords = new ArrayList<>();

      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++j) {
            if (matrix[i][j] == 0) {
               coords.add(new Coord(i, j));
            }
         }
      }

      for (Coord coord : coords) {
         int row = coord.x;
         int column = coord.y;

         for (int i = 0; i < matrix.length; ++i) {
            matrix[row][i] = 0;
         }

         for (int i = 0; i < matrix.length; ++i) {
            matrix[i][column] = 0;
         }
      }

      return matrix;
   }

   public static class Coord {
      int x;
      int y;

      public Coord(int x, int y) {
         this.x = x;
         this.y = y;
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Coord coord = (Coord) o;
         return x == coord.x &&
            y == coord.y;
      }

      @Override
      public int hashCode() {
         return Objects.hash(x, y);
      }
   }
}
