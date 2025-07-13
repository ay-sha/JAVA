package Problem;

public class KthChar {
    static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length()<=k){
            int size = sb.length(); 
            for(int i=0; i<size; i++){
                char nxt; 
                if(sb.charAt(i)=='z'){
                    nxt = 'a'; 
                }
                else{
                    nxt =(char)(sb.charAt(i)+1);
                    //System.out.println(nxt); 
                }
                sb.append(nxt); 
            }
        }

        return sb.charAt(k-1); 
    }
    public static void main(String[] args) {
        System.out.println(kthCharacter(10));
    }
}
