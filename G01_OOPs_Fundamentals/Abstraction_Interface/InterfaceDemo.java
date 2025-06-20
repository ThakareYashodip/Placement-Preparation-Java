interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
