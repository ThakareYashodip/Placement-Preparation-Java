// AnimalOverride.java

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalOverride {
    public static void main(String[] args) {
        Animals a = new Cat(); // Parent reference, child object
        a.sound();            // Output: Cat meows (runtime)
    }
}
