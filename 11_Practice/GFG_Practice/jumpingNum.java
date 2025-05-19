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

    public static int cntSq(int target) {
        int count = 0;
        for (int i = 1; i < target; i++) {
            if (i * i < target) {
                count++;
            }
        }
        return count;
    }

    public static int findSubString(String txt, String pat) {
        int txtlength = txt.length();
        int patlength = pat.length();

        for (int i = 0; i <= txtlength - patlength; i++) {
            int j;
            for (j = 0; j < patlength; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (patlength == j) {
                return i;
            }
        }
        return -1;
    }

    public static int heightBuilding(int arr[]) {
        int count = 1;
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        if (arr.length == 1) {
            return 1;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                count++;
                temp = arr[i];
            }
        }
        return count;
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

        // Count Squares
        int target = 9;
        System.out.println("Result of Count Squares is : " + cntSq(target));

        String s1 = "GeeksForGeeks";
        String s2 = "For";
        System.err.println("First Occurence of substring is : " + findSubString(s1, s2));
        System.err.println("First Occurence of substring is : " + s1.indexOf(s2));

    }
}
