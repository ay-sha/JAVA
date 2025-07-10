package OOP;

public class Abstraction {
    public static void main(String[] args) {
        Horse hr = new Horse(); 
        hr.eat();
        hr.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        c.changeColor();
        System.out.println(c.color);

        Foal baby = new Foal(); //parent constructor then child constructor 
    }
}

abstract class Animal{
    String color; 
    Animal(){
        System.out.println("Animal Constructor called");
        color = "Brown";
    }
    void eat (){
        System.out.println("Animal Eats");
    }
    abstract void walk(); 
}
class Horse extends Animal {
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void walk (){
        System.out.println("Walks on 4 legs");
    }
    void changeColor (){
        color = "Dark Brown";
    }
}
class Foal extends Horse{
    Foal(){
        System.out.println("Foal Constructor is called");
    }
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Chicken Constructor called");
    }
    void walk (){
        System.out.println("Walks on 2 legs");
    }
    void changeColor (){
        color = "Yellow";
    }
}