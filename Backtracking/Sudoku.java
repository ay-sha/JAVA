package Backtracking;

public class Sudoku {
    static void printSudoku(int sudoku [][]){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //col 
        for (int i = 0; i <=8; i++) {
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for (int j = 0; j <=8; j++) {
            if (sudoku[row][j]==digit){
                return false;
            }
        }
        //3x3 box
        int sr = (row/3)*3; 
        int sc = (col/3)*3; 
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row==9){
            return true; 
        }
        //calculate nxt row and col
        int nxtRow = row, nxtCol = col+1; 
        if(col+1==9){
            nxtRow= row+1;
            nxtCol=0; 
        }
        // if value is not 0 then, can't edit them 
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nxtRow, nxtCol);
        }

        //check per cell and store suitable number 
        for (int digit = 1; digit<=9 ; digit++) {
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nxtRow, nxtCol)){
                    return true; 
                }
                sudoku[row][col]=0;
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exist");
            printSudoku(sudoku); 
        }
        else{
            System.out.println("Solution do no exist");
        }
    }
}
