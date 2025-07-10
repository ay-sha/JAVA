package OOP;

public class Polymorphism {
    public static void main(String[] args) {

        // Method Overloading 
        Calculator calc = new Calculator(); 
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        // Method overriding 
        Dog coco = new Dog();
        coco.eat();
    }
}
class Calculator {
    // compile time polymorphism: Method Overloading 
    int sum (int a, int b){
        return a+b;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}

class Animal {
    void eat(){
        System.out.println("Eats Anything");
    }
    
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eats Meats");
    }
}