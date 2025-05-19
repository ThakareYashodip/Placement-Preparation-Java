import java.util.Scanner;

public class jumpingNum {

    public static boolean checkJumpingNumb(int num) {
        String str = String.valueOf(num);
        // String str = Integer.toString(num);
        // String str = "" + num;
        int[] digitArr = new int[str.length()];
        for (int i = 0; i < digitArr.length; i++) {
            // digitArr[i] = Character.getNumericValue(str.charAt(i));
            // digitArr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            digitArr[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < digitArr.length - 1; i++) {
            int temp = Math.abs(digitArr[i] - digitArr[i + 1]);
            if (temp > 1 || temp < 1) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Result : " + checkJumpingNumb(num));
        System.out.println(factorial(num));

        // Compute nCr
        int a = 5;
        int b = 2;
        int temp = a - b;
        int prod = factorial(temp) * factorial(b);
        System.out.println("Result of nCr is : " + Math.abs(factorial(a) / prod));

        // Compute nPr
        int n = 5;
        int r = 2;
        int temp2 = n - r;
        System.out.println("Result of nPr is : " + Math.abs(factorial(n) / factorial(temp2)));

    }
}
