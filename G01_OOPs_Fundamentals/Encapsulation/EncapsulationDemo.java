// EncapsulationDemo.java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        int arr[] = { 2, 2, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        int br[] = removeDuplicates(arr);
        System.out.println(Arrays.toString(br));

        String str = "Nitin";
        System.out.println(checkPallindrome(str));

    }

    // private static boolean checkPallindrome(String str) {
    //     int index = 0;
    //     // String str = string.toUpperCase();
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         if (str.charAt(i) != str.charAt(index)) {
    //             return false;
    //         }
    //         index++;
    //     }
    //     return true;
    // }

    private static boolean checkPallindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static int[] removeDuplicates(int[] arr) {
        int left = 0;
        int right = 1;
        int index = 0;
        int temp[] = new int[arr.length];
        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                temp[index] = arr[left];
                left = right;
                index++;
            }
            right++;
        }
        // Create a new array with the correct size and copy the elements
        int result[] = new int[index + 1];
        System.arraycopy(temp, 0, result, 0, index);
        result[index] = arr[left]; // Add the last element
        return result;
    }
}
