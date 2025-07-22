package DevideConqure;

public class StringMergeSort {
    static void PrintArray(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void mergeSortString(String arr[], int s, int e){
        if(s>=e){
            return; 
        }
        int mid = s+(e-s)/2; 
        mergeSortString(arr, s, mid);
        mergeSortString(arr, mid+1, e);
        mergeString(arr, s, mid, e);
    }
    static void mergeString(String arr[], int s, int mid, int e){
        String temp [] = new String[e-s+1];
        int i = s;
        int j = mid+1; 
        int k = 0; 

        while (i<=mid && j<=e) {
            if(arr[i].compareToIgnoreCase(arr[j])<0){
                temp[k] = arr[i]; 
                i++; 
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++; 
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=e) {
            temp[k++]=arr[j++];
        }
        for (k = 0, i =s ; k < temp.length; k++,i++) {
            arr[i]=temp[k];  
        }
    }
    public static void main(String[] args) {
        String arr []= { "sun", "earth", "mars", "mercury"};
        mergeSortString(arr, 0, arr.length-1);
        PrintArray(arr);
    }
}
