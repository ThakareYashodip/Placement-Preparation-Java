public class FirstNonRep {
    public static void main(String[] args) {
        String s1 = "Geeksfrogeeks";
        System.out.println(nonRepeatingChar(s1));
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
}
