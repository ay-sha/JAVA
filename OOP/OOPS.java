package OOP;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); //created a pen obj named as p1;
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Aysha Amin";
        // myAcc.setPass("12345");
        // System.out.println(myAcc.getPass());

        // Student s1 = new Student("Aysha");
        // System.out.println(s1.name);
        // Student s2 = new Student(14488);
        // // System.out.println(s2.name); //name= null;
        // System.out.println(s2.roll);

        Student s1 = new Student();
        s1.name = "Aysha";
        s1.roll = 14488;
        s1.cg = (float) 3.93;
        s1.marks[0] = 80;
        s1.marks[1] = 81;
        s1.marks[2] = 82;

        Student s2 = new Student(s1); //copy
        s2.cg = (float) 3.95;
        s1.marks[2] = 87;

        for(int i =0; i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
        System.out.println();
    }
}

class BankAccount {
    public String username;
    private String password;

    String getPass() {
        return this.password;
    }

    public void setPass(String pass) {
        password = pass;
    }
}

class Pen {
    private String color;
    private int tip;

    // getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setter
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class Student {
    String name;
    int roll;
    float cg;
    int marks[];

    Student() {
        System.out.println("Constructor is called!");
        marks = new int[3];
    }

    Student(String name) {
        System.out.println("Constructor 1");
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        System.out.println("constructor 2");
        marks = new int[3];
        this.roll = roll;
    }

    Student(String name, int roll) {
        System.out.println("constructor 3");
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    // Shallow Copy constructor
    // Student(Student s1) {
    //     System.out.println("constructor 4");
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

     // Deep Copy constructor
    Student(Student s1) {
        System.out.println("constructor 4");
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // void calculate(int phy, int chem, int math){
    // cg = (phy+chem+math)/3;
    // }
}