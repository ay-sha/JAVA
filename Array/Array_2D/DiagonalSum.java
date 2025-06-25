package Array.Array_2D;
import java.util.Scanner;

public class DiagonalSum {
static void diagonalSum(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length; 
        int PD =0; 
        int SD =0; 
        
        //diagonal sum
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                //primary
                if(i==j){
                    PD+=matrix[i][j];
                }
                else if(i+j==n-1){
                    SD+=matrix[i][j];
                }
            }
        }
        System.out.println(PD); 
        System.out.println(SD); 
        System.out.println("Total Diagonal Sum: "+(PD+SD)); 
        PD =0; 
        SD =0; 

        //optimized
        for(int i=0; i<n;i++){
            PD+=matrix[i][i];
            if(i != n-1-i){
                SD+=matrix[i][n-1-i];  //i+j=n-1 => j=n-1-i
            }
        }
        System.out.println(PD); 
        System.out.println(SD); 
        System.out.println("Optimized Diagonal Sum: "+(PD+SD));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int matrix [][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        diagonalSum(matrix);
        sc.close();
    }
}
