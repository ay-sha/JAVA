package DevideConqure;

public class SortedRotated {
    static int search(int arr[], int k, int s, int e){ 
        if(s>e){
            return -1; 
        }

        int mid = s+(e-s)/2; 
        //case found 
        if(arr[mid]==k){
            return mid; 
        }
        // mid on L1
        if(arr[s]<=arr[mid]){
            // case a: left
            if(arr[s]<=k && k<=arr[mid]){
                return search(arr, k, s, mid-1); 
            }
            //case b: right
            else{
                return search(arr, k, mid+1, e); 
            }
        }
        //mid on line 2
        else{
            //case c: right 
            if(arr[mid]<=k && k<=arr[e]){
                return search(arr, k, mid+1, e);
            }
            //case d: left
            else{
                return search(arr, k, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2}; 
        int k = 9; 
        System.out.println(search(arr, k, 0, arr.length-1));
    }
}
