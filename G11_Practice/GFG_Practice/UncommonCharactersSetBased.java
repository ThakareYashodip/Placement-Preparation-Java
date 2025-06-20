// import java.util.HashMap;
// import java.util.Map;

// public class UncommonCharacters {

//     // public static void charFrequency(String s1, String s2) {
//     // HashMap<Character, Integer> hs = new HashMap<>();

//     // // Count frequency in both strings
//     // for (int i = 0; i < s1.length(); i++) {
//     // hs.put(s1.charAt(i), hs.getOrDefault(s1.charAt(i), 0) + 1);
//     // }
//     // for (int j = 0; j < s2.length(); j++) {
//     // hs.put(s2.charAt(j), hs.getOrDefault(s2.charAt(j), 0) + 1);
//     // }

//     // // Print characters that appear only once (uncommon)
//     // System.out.print("Uncommon characters: ");
//     // for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
//     // if (entry.getValue() == 1) {
//     // System.out.print(entry.getKey() + " ");
//     // }
//     // }
//     // System.out.println();
//     // }

//     public static void printUncommonCharacters(String s1, String s2) {
//         Map<Character, Integer> freqMap = new HashMap<>();

//         // Add frequency from both strings
//         for (char ch : (s1 + s2).toCharArray()) {
//             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//         }

//         // Print characters that appear only once
//         System.out.print("Uncommon characters: ");
//         for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//             if (entry.getValue() == 1) {
//                 System.out.print(entry.getKey() + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String s1 = "geeksforgeeks";
//         String s2 = "geeksquiz";

//         // charFrequency(s1, s2);
//         printUncommonCharacters(s1, s2);
//     }
// }

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UncommonCharactersSetBased {

    public static void printUncommonCharacters(String s1, String s2) {
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

        for (char c : s1.toCharArray())
            set1.add(c);
        for (char c : s2.toCharArray())
            set2.add(c);


        Set<Character> uncommon = new TreeSet<>(set1);
        uncommon.addAll(set2);

        Set<Character> common = new TreeSet<>(set1);

        common.retainAll(set2);

        uncommon.removeAll(common);

        System.out.print("Uncommon characters: ");
        for (char c : uncommon) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";

        printUncommonCharacters(s1, s2);
    }
}
