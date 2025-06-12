package java11_6_2025;

import java.util.*;

public class NQueensSolver {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Backtrack from row 0
        backtrack(0, board, result, new boolean[n], new boolean[2 * n], new boolean[2 * n]);

        return result;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> result,
                                   boolean[] cols, boolean[] d1, boolean[] d2) {
        int n = board.length;
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            int id1 = row - col + n;
            int id2 = row + col;

            if (cols[col] || d1[id1] || d2[id2])
                continue;

            // Place queen
            board[row][col] = 'Q';
            cols[col] = d1[id1] = d2[id2] = true;

            backtrack(row + 1, board, result, cols, d1, d2);

            // Remove queen (backtrack)
            board[row][col] = '.';
            cols[col] = d1[id1] = d2[id2] = false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Solutions for " + n + "-Queens:");
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
