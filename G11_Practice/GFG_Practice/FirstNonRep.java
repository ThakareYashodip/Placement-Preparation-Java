public class FirstNonRep {
    public static void main(String[] args) {
        String s1 = "Geeksfrogeeks";
        System.out.println(nonRepeatingChar(s1.toLowerCase()));
        System.out.println(nonRepeatingChar2(s1.toLowerCase()));
    }

    public static char nonRepeatingChar(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return str.charAt(i);
            }
        }
        return 0;
    }

    public static char nonRepeatingChar2(String str) {
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : str.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '0';
    }
}
