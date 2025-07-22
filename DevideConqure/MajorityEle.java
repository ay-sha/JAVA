package DevideConqure;

import java.util.Arrays;

public class MajorityEle {
    static int majorityElement(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);
        int chk = nums[n / 2];
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == chk) {
                c++;
            }
            if (c >= n / 2) {
                return chk;
            }
        }
        return -1;
    }
    static int mooresMajorityElement(int nums[]) {
        int n = nums.length;
        int vote = 0;
        int chk=0; 

        for (int i = 0; i < n; i++) {
            if(vote==0){
                chk = nums[i]; 
            }
            if (nums[i] == chk) {
                vote++;
            }
            else{
                vote--; 
            }
        }
        // return chk; 
        int c =0; 
        for (int i = 0; i < n; i++) {
            if(nums[i]==chk){
                c++; 
            }
        }
        return c>n/2 ? chk: -1;
    }
    static int countRange(int arr[], int num, int l, int h){
        int c=0; 
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                c++; 
            }
        }
        return c; 
    }

    static int optimizeRecursion(int arr[], int l, int h){
        if(l==h){
            return arr[l]; 
        }
        int mid = l+(h-l)/2; 
        int left = optimizeRecursion(arr, l, mid);
        int right = optimizeRecursion(arr, mid+1,h);

        if(l==right){
            return left; 
        }
        int leftCount = countRange(arr, left, l, h); 
        int rightCount = countRange(arr, right, l, h); 

        return leftCount>rightCount? left : right;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));

        //with recursion
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(optimizeRecursion(arr, 0, arr.length-1));

        //moore's voting 
        System.out.println(mooresMajorityElement(arr));
    }
}
