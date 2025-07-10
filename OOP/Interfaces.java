package OOP;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

         // Multiple Inheritance 
        System.out.println("Multiple Inheritance");
        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
        bear.sleep();
        System.out.println();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Up, Down, Left, Right and Diagonal(in all the way)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("Up, Down, Left and Right");
    }
}
class King implements ChessPlayer {
    public void moves(){
        System.out.println("Up, Down, Left, Right and Diagonal (by 1 step)");
    }
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

