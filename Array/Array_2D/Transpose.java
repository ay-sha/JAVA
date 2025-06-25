package Array.Array_2D;

public class Transpose {
    static void print2DArray(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length; 
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int matrix[][],int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp; 
            }
        }
        print2DArray(matrix);
    }
    static void transpose(int matrix[][], int n, int m){
        int result [][]= new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i]= matrix[i][j]; 
            }
        }
        print2DArray(result);
    }

    public static void main(String[] args) {
        int matrix [][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        if(n==m){
            transpose(matrix, n);
        }
        else{
            transpose(matrix, n, m);
        }
    }
}
