package Array.Array_1D;
//related to Kadens
public class MaxProdSubArr {
    static int maxProductSubArr(int arr[]){
        int mx = arr[0];
        int mn = arr[0];
        int ans = arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = mx;
                mx=mn;
                mn=temp; 
            }
            mx= Math.max(mx*arr[i], mx);
            mn= Math.min(mn*arr[i], mn);
            ans = Math.max(ans, mx); 
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {-1,-10,-5,2};
        System.out.println(maxProductSubArr(arr));
    }
}
