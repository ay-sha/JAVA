package Array.Array_1D;
import java.util.*;

public class Reverse {
    static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverseArray(int arr[]){
        int start=0, end=arr.length-1; 
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp; 

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Array Size: ");
        int n = sc.nextInt(); 
        int arr [] = new int[n]; 
        System.out.println("Input Value: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        reverseArray(arr);
        PrintArray(arr); 
    }
}
