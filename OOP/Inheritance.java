package OOP;

public class Inheritance {
    public static void main(String[] args) {

        // single level inheritance
        System.out.println("Single Level Inheritance");
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
        System.out.println();

        // multilevel inheritance
        System.out.println("Multi Level Inheritance");
        Dog coco = new Dog();
        coco.Nlegs=4; 
        coco.Legs();
        coco.eat();
        System.out.println();

        // Hierarchy inheritance
        System.out.println("Hierarchy Inheritance");
        Birds piku = new Birds();
        System.out.print("Shark can "+" ");
        shark.eat();
        System.out.print("Coco can "+" ");
        coco.eat();
        System.out.print("Piku can "+" ");
        piku.eat();
        System.out.println();

        // Hybrid Inheritance 
        System.out.println("Hybrid Inheritance");
        Shark sh = new Shark();
        sh.swim();
        sh.hunt(); 

        Peacock pk = new Peacock();
        pk.dance();
        pk.breath();

        Humans hm = new Humans();
        System.out.print("Humans ");
        hm.eat();
        hm.Nlegs=2;
        System.out.print("Humans ");
        hm.Legs();
        System.out.println();

        // Multiple Inheritance 
        System.out.println("Multiple Inheritance");
        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
        bear.sleep();
        System.out.println();
    }
}

class Animal {
    String color;

    void eat (){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breath");
    }
}

// child 1
class Fish extends Animal {
    int fins;
    void swim (){
        System.out.println("Swims in water");
    }
}
class Shark extends Fish {
    void hunt() {
        System.out.println("Shark hunts smaller fish.");
    }
}

class Tuna extends Fish {
    void speedSwim() {
        System.out.println("Tuna swims very fast.");
    }
}

// child 2
class Birds extends Animal {
    void fly (){
        System.out.println("Can Fly");
    }
}

class Crow extends Birds {
    void sound (){
        System.out.println("Crow makes a caw sound.");
    }
}

class Peacock extends Birds{
    void dance (){
        System.out.println("Peacock dances beautifully.");
    }
}

// child 3
class Mammal extends Animal {
    int Nlegs; 
    void Legs (){
        System.out.println("Num of Legs: "+Nlegs);
    }
}
class Dog extends Mammal{
    String breed;
}
class Humans extends Mammal{
    String name;
}

// Multiple Inheritance 
interface Herbivore {
    void eatPlants();
}
interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatPlants() {
        System.out.println("Bear eats berries and plants.");
    }

    public void eatMeat() {
        System.out.println("Bear eats fish and small animals.");
    }

    public void sleep() {
        System.out.println("Bear sleeps during hibernation.");
    }
}