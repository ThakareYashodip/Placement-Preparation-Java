import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class palindromicanagramString {
    public static void main(String[] args) {
        String s = "geeksogeeksss";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Count How Many characters have an odd frequency
        int oddCount = 0;
        for (int freq : freqMap.values()) {
            if (freq % 2 != 0) {
                oddCount++;
            }
        }

        // Check palindrome-anagram condition
        if ((s.length() % 2 == 0 && oddCount == 0) || (s.length() % 2 != 0 && oddCount == 1)) {
            System.out.println("The anagram string is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        String str = "geeksgeeks";
        Integer count[] = new Integer[str.length()];
        for (int i = 0; i < count.length; i++) {
            count[i] = (int)str.charAt(i);
            System.out.println(count[i]);
        }
        Arrays.sort(count,Collections.reverseOrder());
        for (Integer integer : count) {
            System.out.println((char)(int)integer);
        }
    }
}
