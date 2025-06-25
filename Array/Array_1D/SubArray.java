package Array.Array_1D;

public class SubArray {
    static void subArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Total sub-arrays: " + (n * (n + 1) / 2));
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        subArr(arr);
    }
}
