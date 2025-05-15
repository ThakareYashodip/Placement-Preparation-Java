// CarDemo.java
class Car {
    String brand;
    int price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tata";
        c1.price = 800000;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.price = 1000000;

        c1.displayDetails();
        System.out.println();
        c2.displayDetails();
    }
}
