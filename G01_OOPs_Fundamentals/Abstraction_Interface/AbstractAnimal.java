abstract class Animal1 {
    abstract void sound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Animal sleeps...");
    }
}

class Dogs extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Animal1 a = new Dogs(); // Reference of abstract class
        a.sound();
        a.sleep();
    }
}
