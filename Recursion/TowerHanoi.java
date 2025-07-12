package Recursion;

public class TowerHanoi {
    static void hanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
            return; 
        }
        // src , helper , dest
        hanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        hanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        // n- number of disk, A- Star B-Helper C-end
        hanoi(3, "A", "B", "C");
    }
}
