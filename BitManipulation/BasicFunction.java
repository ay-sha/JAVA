package BitManipulation;

public class BasicFunction {
static int getIthBit(int n ,int i){
        int bitMask =1<<i; 
        if((n & bitMask)==0){
            return 0;
        }
        return 1; 
        
    }
    static int setIthBit(int n ,int i){
        int bitMask =1<<i; 
        return n| bitMask; 
        
    }
    static int clearIthBit(int n ,int i){
        int bitMask= ~(1<<i); 
        return n & bitMask; 
        
    }
    static int clearIBits(int n ,int i){
        int bitMask= (~0)<<i; 
        return n & bitMask; 
        
    }
    static int clearBitsInRange(int n ,int i, int j){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1; 
        
        int bitMask= a|b; 
        return n & bitMask; 
        
    }
    static int updateIthBit(int n ,int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //       return setIthBit(n,i);
        // }
        n= clearIthBit(n,i);
        int bitMask = newBit<<i; 
        return n | bitMask; 
    }
    static boolean isPowerofTwo(int n){
        if (n <= 0) return false;
        return (n&(n-1)) == 0;
    }
    static int countSetBits(int n){
        int c =0; 
        while(n>0){
            if((n&1) !=0){ //lsb=1
                c++; 
            }
            n=n>>1; 
        }
        return c; 
    }
    static int fastExponention(int a, int n){
        int ans=1; 
        while(n>0){
            if((n&1)!=0){ //lsb=1; 
                ans=ans*a; 
            }
            a=a*a;
            n=n>>1; 
        }
        return ans; 
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,3));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1)); 
        System.out.println(clearIBits(15,2));
        System.out.println(clearBitsInRange(10,2,4));
        System.out.println(isPowerofTwo(16));
        System.out.println(countSetBits(15));
        System.out.println(fastExponention(3,3));
    }
}
