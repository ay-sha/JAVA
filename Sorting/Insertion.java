package Sorting;

public class Insertion {
    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void inserionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n;i++){
            int curr =arr[i]; 
            int prev = i-1; 
            //findout correct position
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--; 
            }
            //insertion
            arr[prev+1]=curr; 
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,3,7,16,22,25,16,9};
        inserionSort(arr);
        printArr(arr);
    }
}
