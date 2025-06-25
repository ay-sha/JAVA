package Array.Array_2D;

import java.util.Scanner;

public class StairCase_Search {
    static void sortedSearch(int matrix[][], int k){
        boolean flag = false; 
        int n = matrix.length; 
        int m = matrix[0].length; 
        int row = 0; 
        int col = m-1; 

        while (row<n && col>=0) {
            if(matrix[row][col]==k){
                System.out.println("Found at: ("+row+","+col+")");
                flag=true;
                break;
            }
            else if(matrix[row][col]>k){
                col--;
            }
            else{
                row++; 
            }
        }

        if(!flag){
            System.out.println("Not Found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int matrix [][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        sortedSearch(matrix,k); 
        sc.close();
    }
}
