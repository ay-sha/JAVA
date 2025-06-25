package Sorting;

public class Counting {
    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void countingSort(int arr[]) {
        int mx = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int countArr[] = new int[mx + 1];
        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[j] = i;
                j++;
                countArr[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {2,0,2,1,1,0};
        countingSort(arr);
        printArr(arr);
    }
}
