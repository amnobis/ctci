package topcoder;

/**
 * @author anobis
 */
public class Sudoku {
    public static void main(String[] args) {
        int[][] grid = new int[9][9];

        initGrid(grid);
    }

    public static void initGrid(int[][] grid) {

    }

    String s ="1 3 9 7 4 8 6 5 2"
            + "7 4 2 6 5 1 8 3 9"
            + "8 2 6 1 3 9 4 7 5"
            + "9 1 7 5 8 6 2 4 3"
            + "2 6 4 3 1 7 5 9 8"
            + "5 9 8 4 6 2 3 1 7"
            + "6 5 1 8 9 3 7 2 4"
            + "3 7 5 9 2 4 1 8 6"
            + "4 8 3 2 7 5 9 6 1";
}
