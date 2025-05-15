// EncapsulationDemo.java

class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Yashodip");
        s.setAge(22);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
