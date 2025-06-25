package Sorting;

public class Bubble {
    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("Turn :" + i);
            if (swap == 0) {
                System.out.println("Sorted");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 16, 22, 25, 16, 9};
        bubbleSort(arr);
        printArr(arr);
    }
}
