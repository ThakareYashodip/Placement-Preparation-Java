
// InheritanceDemo.java
class Animal {
    String type = "Animal";

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // Inherited from Animal
        d.bark(); // Own method
        System.out.println("Type: " + d.type);
    }
}
