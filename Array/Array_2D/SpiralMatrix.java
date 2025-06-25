package Array.Array_2D;
import java.util.*;

public class SpiralMatrix {
    static void printSpiralMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length; 
        int sR=0, eR= n-1;
        int sC=0, eC=m-1; 
        
        while(sR<=eR && sC<=eC){
            for(int j=sC; j<=eC;j++){
                System.out.print(matrix[sR][j]+" "); 
            }
            for(int i=sR+1; i<=eR;i++){
                System.out.print(matrix[i][eC]+" ");
            }
            for(int j=eC-1; j>=sC;j--){
                if(sR==eR){
                    break;
                }
                System.out.print(matrix[eR][j]+" "); 
            }
            for(int i=eR-1; i>=sR+1;i--){
                if(sC==eC){
                    break;
                }
                System.out.print(matrix[i][sC]+" ");
            }
            sR++;
            sC++;
            eR--;
            eC--; 
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
        };
        printSpiralMatrix(matrix);
        sc.close();
        
    }
}
