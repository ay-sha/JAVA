package OOP;

public class Keywords {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amin";
        s1.roll = 14488; 
        //s1.sclName = "Jubilee";

        Student s2 = new Student();
        System.out.println(s2.roll); // 0
        //System.out.println(s2.sclName); // Jubilee

        Hippo hp = new Hippo();
        System.out.println(hp.color);
    }
}

class Student {
    String name;
    int roll; 
    static String sclName; 
    
    void setName( String name){
        this.name = name; 
    }
    String getName(){
        return this.name; 
    }

    void setRoll( int roll){
        this.roll = roll; 
    }
    int geRoll(){
        return this.roll; 
    }

    static double result (int math, int phy, int chem){
        return (math+phy+chem)/3.0; 
    }
}

class Animal {
    String color; 
    Animal(){
        System.out.println("Animal constructor is called");
        System.out.println(color);
    }
}
class Hippo extends Animal{
    Hippo(){
        super();
        super.color = "Brown";
        System.out.println("Hippo constructor is called");
    }
}