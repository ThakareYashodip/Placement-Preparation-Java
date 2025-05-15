// PersonDemo.java
class Person {
    String name;
    int age;

    // Method
    void greet() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person(); // Create object
        p1.name = "Yashodip";
        p1.age = 22;
        p1.greet(); // Call method
    }
}
