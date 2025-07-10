package OOP;

public class Practice {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.print(); // child class print for overriding
        // v.print1(); // can't call print1 function

        Vehicle v2 = new Vehicle();
        v2.print(); // parents class print

        System.out.println(Book.count); // 0
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);// 2

        Test t = new Test();
        t.setMarks(98);
        System.out.println(Test.marks);// 98

        Test t2 = new Test();
        t2.changeB();
        System.out.println(Test.a + Test.b);


        // complex 
        Complex a = new Complex(4, 5);
        Complex b = new Complex(9, 4); 

        Complex sum = Complex.sum(a, b);
        Complex diff = Complex.diff(a, b);
        Complex prod = Complex.prod(a, b);

        sum.printVal();
        diff.printVal();
        prod.printVal();

    }
}

class Vehicle {
    void print() {
        System.out.println("Parent Class");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Child Class");
    }

    void print1() {
        System.out.println("Child Class");
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }

}

class Test {
    static int marks;
    static int a = 10;
    static int b;

    void setMarks(int marks) {
        this.marks = marks;
    }

    static void changeB() {
        b = a * 3;
    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex sum(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printVal(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(real!=0 && imag==0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}
