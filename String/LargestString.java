package String;

public class LargestString {
    public static void main(String[] args) {
        String strArr []= {"I","am","Aysha","Amin","Sumi"}; 
        String largest = strArr[0]; 
        for (int i = 0; i < strArr.length; i++) {
            if(largest.compareToIgnoreCase(strArr[i])<0){
                largest= strArr[i]; 
            }
        }
        System.out.println(largest); 
    }
}
