package Recursion;

public class Basic {
    static void printDecVal (int n){
        if (n==1) {
            System.out.println(n+" ");
            return; 
        }
        System.out.print(n+" ");
        printDecVal(n-1);
    }
    static void printIncVal (int n){
        if (n==1) {
            System.out.println();
            System.out.print(n+" ");
            return; 
        }
        printIncVal(n-1);
        System.out.print(n+" ");
    }
    static int Factorial (int n){
        if (n==0) {
            return 1; 
        }
        int fact = Factorial(n-1);
        int fn = n* fact; 
        return fn;
    }
    static int Sum (int n){
        if (n==1) {
            return 1; 
        }
        int prev = Sum(n-1);
        int sum = n + prev; 
        return sum;
    }

    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib = fibonacci(n-1)+fibonacci(n-2);
        return fib; 
    }

    static boolean isSorted(int arr[], int i){   
        if (i==arr.length-1) {
            return true; 
        }
        if(arr[i]>arr[i+1]){
            return false; 
        }
        return isSorted(arr, i+1);
    }

    static int firstFoundAt(int arr[], int i,int k){
        if(i==arr.length-1){
            return -1; 
        }
        if(arr[i]==k){
            return i; 
        }
        return firstFoundAt(arr, i+1, k);
    }
    static int lastFoundAt(int arr[], int i,int k){
        if(i==arr.length-1){
            return -1; 
        }
        int isFound = lastFoundAt(arr, i+1, k);
        if (isFound==-1 && arr[i]==k) {
            return i;
        }
        return isFound; 
    }
    static int Power(int x, int n){
        if(n==0){
            return 1; 
        }
        int power = x* Power(x, n-1);
        return power;
    }
    static int optimizedPower(int x, int n){ // O(logn)
        if(n==0){
            return 1; 
        }

        int half = optimizedPower(x, n/2);
        int power = half*half; 
        if(n%2!=0){
            power = x * power;
            return power; 
        }
        return power;
    }
    public static void main(String[] args) {
        int n =10;
        int arr []= {1,2,3,4,5,3,4,3,5};
        printDecVal(n);
        printIncVal(n); 
        System.out.println();
        System.out.println(Factorial(5));
        System.out.println(Sum(5));
        System.out.println(fibonacci(10));
        System.out.println(isSorted(arr, 0));
        System.out.println(firstFoundAt(arr, 0,3));
        System.out.println(lastFoundAt(arr, 0,3));
        //System.out.println(Power( 2,5));
        System.out.println(optimizedPower( 2,5));
    }
}
