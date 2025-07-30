package Backtracking;

public class Array {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void changeArr(int arr[], int indx, int val){
        if(indx==arr.length){
            printArray(arr);
            return; 
        }
        arr[indx]= val; 
        changeArr(arr, indx+1, val+1); // func call step
        arr[indx] = arr[indx]-2; // backtracking step
    }
    public static void main(String[] args) {
        int arr [] = new int [5]; 
        changeArr(arr, 0, 1);
        printArray(arr); 
    }
}
