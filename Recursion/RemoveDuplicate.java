package Recursion;

public class RemoveDuplicate {
    static void removeDuplicate(String str, int idx, StringBuilder sb, boolean map []){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char curr = str.charAt(idx); 
        if(map[curr-'a']==true){
            removeDuplicate(str, idx+1, sb, map);
        }
        else{
            map[curr-'a']=true;
            removeDuplicate(str, idx+1, sb.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String str = "ayshaa"; 
        StringBuilder sb = new StringBuilder(""); 
        boolean map []= new boolean [26]; 
        removeDuplicate(str,0, sb, map);
    }
}
