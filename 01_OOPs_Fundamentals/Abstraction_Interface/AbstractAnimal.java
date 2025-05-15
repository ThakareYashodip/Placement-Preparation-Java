abstract class Animal {
    abstract void sound();  // Abstract method

    void sleep() {          // Concrete method
        System.out.println("Animal sleeps...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Animal a = new Dog(); // Reference of abstract class
        a.sound();
        a.sleep();
    }
}
