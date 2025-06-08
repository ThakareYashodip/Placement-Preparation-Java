// CalculatorOverload.java

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(int a, int b, int d,int m) {
        return a + b + c + m;
    }
}

public class CalculatorOverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));            // int
        System.out.println(calc.add(2.5, 4.3));        // double
        System.out.println(calc.add(1, 2, 3));         // 3 arguments
        System.out.println(calc.add(1, 2, 3));         // 3 arguments
    }
}
