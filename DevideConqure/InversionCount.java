package DevideConqure;

public class InversionCount {
    static int count(int arr[]) {
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    c++;
                }
            }
        }
        return c;
    } 

    static int optimizedCount(int arr[], int s, int e){
    if (s >= e) return 0;

    int mid = s + (e - s) / 2;
    int left = optimizedCount(arr, s, mid);
    int right = optimizedCount(arr, mid + 1, e);
    int cross = merge(arr, s, mid, e);
    return left + right + cross;
}

    static int merge(int arr[], int s, int mid, int e){
        int cnt = 0; 
        int temp [] = new int [e-s+1];
        int i = s;  //left
        int j = mid+1;  //right 
        int k = 0;   //temp
        while (i<=mid && j<=e) {
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
            }
            else{
                temp[k]= arr[j];
                cnt += (mid-i+1); 
                j++; 
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++]; 
        }
        while (j<=e) {
            temp[k++] = arr[j++]; 
        }
        for (k = 0, i=s; k < temp.length; k++,i++) {
            arr[i] = temp[k]; 
        }
        return cnt; 
    }
    

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(count(arr)); 
        System.out.println(optimizedCount(arr, 0, arr.length-1));
    }
}
