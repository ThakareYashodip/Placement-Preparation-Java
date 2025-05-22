/*
 * Check if Strings Are Rotations of Each Other
 * Given two string s1 and s2 of same length, the task is to check whether s2 is a rotation of s1.
 * Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.

Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.
*/

public class StringRotation {

    public static boolean areRotation(String s1, String s2) {
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.equals(s2)) {
                return true;
            }
            char last = s1.charAt(n - 1);
            s1 = last + s1.substring(0, n - 1);
        }
        return false;
    }

    // public static boolean areRotation(String s1, String s2) {
    // s1 = s1 + s1;
    // if (s1.contains(s2)) {
    // return true;
    // }
    // return false;
    // }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotation(s1, s2)); // Output: true

        s1 = "aab";
        s2 = "aba";
        System.out.println(areRotation(s1, s2)); // Output: true

        s1 = "abcd";
        s2 = "acbd";
        System.out.println(areRotation(s1, s2)); // Output: false

        s1 = "nitin";
        s2 = "tinni";
        System.out.println(areRotation(s1, s2));
    }

}
