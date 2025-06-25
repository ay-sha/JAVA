package Basic;
import java.util.*;

public class Basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //array
        int arr [] = new int [n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //Arrays.sort(arr);

        //2D Array
        n = sc.nextInt(); 
        int m = sc.nextInt();
        int matrix [][] = new int [n][m];
        
        System.out.println();
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}