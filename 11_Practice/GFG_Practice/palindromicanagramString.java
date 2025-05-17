import java.util.HashMap;

public class palindromicanagramString {
    public static void main(String[] args) {
        String s = "geeksogeeksss";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Count how many characters have an odd frequency
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
    }
}
