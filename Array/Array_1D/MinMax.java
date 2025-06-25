package Array.Array_1D;

public class MinMax {
    static int getMinMax(int arr[]){
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i]; 
            }
            if(arr[i]<mn){
                mn=arr[i]; 
            }
        }
        System.out.println("Smallest Value is "+mn);
        return mx; 
    }
    public static void main(String[] args) {
        int arr [] = {1,-2,6,-1,3};
        System.out.println("Largest value is "+ getMinMax(arr));
    }
}
