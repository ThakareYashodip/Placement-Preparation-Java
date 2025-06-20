// AnimalOverride.java

import java.util.HashMap;
import java.util.Map;

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalOverride {
    public static void main(String[] args) {
        Animals a = new Cat(); // Parent reference, child object
        a.sound(); // Output: Cat meows (runtime)

        String s = "geeksogeeksss";
        HashMap<Character, Integer> hs = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!hs.containsKey(ch)) {
                hs.put(ch, 1); // First time seeing the character
            } else {
                hs.remove(ch);
               // hs.put(ch, 0); // Repeated character
            }
        }
        for (Map.Entry<Character,Integer> entry :  hs.entrySet()) {
            if(s.length() % 2 != 0 && hs.size() == 1){
                System.out.println("The anagram string is pallindrome");
            }else{
                System.out.println("Not pallindorme ");
            }
            //System.out.println(entry.getKey() + "  " + entry.getValue() + " " );
        }
    }
}
