public class StringBasics {
    public static void main(String[] args) {
        String str = " Java Mastery ";
        String str2 = "Java Mastery";

        // Original
        System.out.println("Original: '" + str + "'");

        // Trim
        System.out.println("Trimmed: '" + str.trim() + "'");

        //compareTo
        System.out.println("CompareTo: " + str.compareTo(str2));
        // Length
        System.out.println("Length: " + str.length());

        // Case conversion
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Character at specific index
        System.out.println("Char at index 2: " + str.charAt(2));

        // Substring
        System.out.println("Substring (5, 12): " + str.substring(5, 12));

        // Contains
        System.out.println("Contains 'Master': " + str.contains("Master"));

        // StartsWith & EndsWith
        System.out.println("Starts with ' Java': " + str.startsWith(" Java"));
        System.out.println("Ends with 'y ': " + str.endsWith("y "));

        // Index of first and last occurrence
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        // Equals vs equalsIgnoreCase
        System.out.println("Equals str2: " + str.trim().equals(str2));
        System.out.println("EqualsIgnoreCase str2: " + str.trim().equalsIgnoreCase(str2));

        // Replace
        System.out.println("Replace 'Java' with 'Dart': " + str.replace("Java", "Dart"));

        // ReplaceAll (regex)
        System.out.println("ReplaceAll spaces: " + str.replaceAll(" ", "_"));

        // Split
        String[] words = str.trim().split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        // isEmpty vs isBlank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
        System.out.println("Is blankStr blank? " + blankStr.isBlank());

        // Join
        String joined = String.join("-", "Java", "is", "awesome");
        System.out.println("Joined string: " + joined);

        // Repeat
        System.out.println("Repeat 'Hi ' 3 times: " + " HI ".repeat(3));

        // Strip (Java 11+ alternative to trim)
        System.out.println("Stripped: '" + str.strip() + "'");

        // Format
        String name = "Yashodip";
        int age = 22;
        System.out.println(String.format("Name: %s, Age: %d", name, age));
    }
}
