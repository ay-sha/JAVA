package Array.Array_1D;

public class MaxSubArraySum {
    static void maxSubArrSum(int arr[]){
        int n = arr.length; 
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int start = i; 
            for(int j=i;j<n;j++){
                int end = j;
                int sum=0; 
                for(int k=start; k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k]; 
                }
                System.out.println();
                System.out.println("Sum of Sub Array: "+sum);
                if(sum>mx){
                    mx=sum;
                }
                if(sum<mn){
                    mn=sum; 
                }
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("Max Sum of Sub Arrays: "+mx);
        System.out.println("Min Sum of Sub Arrays: "+mn);
    }
    static void maxsumPrefix(int arr[]){
        int n = arr.length; 
        int sum=0;
        int mx = Integer.MIN_VALUE;
        int prefix [] = new int[n];
        prefix[0]= arr[0];
        
        for(int i=1; i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int i=0;i<n;i++){
            int start = i; 
            for(int j=i;j<n;j++){
                int end = j;
                sum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(sum>mx){
                    mx=sum;
                }
            }
        }
        System.out.println("Max Sum of Sub Arrays: "+mx);
    }

    static void maxsumKadanes(int arr[]){
        int cs=0; 
        int ms= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Sum of Sub Arrays: "+ms);
    }
    static void kandanes(int arr[]){
        int ms= Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                flag=false;
                break;
            }
            else{
                ms = Math.max(ms,arr[i]);
                flag=true;
            }
        }
        if(flag){
            System.out.println("Max Sum of Sub Arrays: "+ms);
        }
        else{
            maxsumKadanes(arr);
    }
    }
    public static void main(String[] args) {
        int arr [] = {1,-2,6,-1,3};
        maxSubArrSum(arr);
        //maxsumPrefix(arr);
        //int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        //kandanes(arr); 
    }
}
