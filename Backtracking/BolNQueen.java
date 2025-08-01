package Backtracking;

public class BolNQueen {
    static int count = 0;

    static void printBoard(char board[][]) {
        System.out.println("----------Queen Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char board[][], int row, int col) {
        // vertical-up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left-diag-up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right-diag-up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static boolean queenPosition(char board[][], int row) {
        if (row == board.length) {
            count++; // total possible way
            return true;
        }
        // col loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (queenPosition(board, row + 1)){
                    return true; 
                }
                board[row][j]='x';
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }

        }
        if(queenPosition(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }
}
