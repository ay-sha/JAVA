package Array.Array_2D;
import java.util.Scanner;

public class Search {
    static void linearSearch(int matrix[][], int k){
        boolean flag = false; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==k){
                    System.out.println("Found at: ("+i+","+j+")");
                    flag = true; 
                    break; 
                }
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
        linearSearch(matrix, k);
        sc.close();
    }
}
