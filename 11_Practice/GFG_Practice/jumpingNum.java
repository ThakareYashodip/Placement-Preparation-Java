import java.util.Scanner;

public class jumpingNum {

    public static boolean checkJumpingNumb(int num){
        String str = String.valueOf(num);
        //String str = Integer.toString(num);
        //String str = "" + num;
        int []digitArr = new int[str.length()];
        for (int i = 0; i < digitArr.length; i++) {
            //digitArr[i] = Character.getNumericValue(str.charAt(i));
            //digitArr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            digitArr[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < digitArr.length-1; i++) {
            int temp = Math.abs(digitArr[i]-digitArr[i+1]);
            if( temp > 1 || temp < 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println( "Result : " + checkJumpingNumb(num));
    }
}
