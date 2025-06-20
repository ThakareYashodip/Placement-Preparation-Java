package G04_DSA_Core.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContainsDupl {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int x : nums) {
            if (hs.containsKey(x)) {
                hs.put(x, hs.getOrDefault(x, 0) + 1);
            } else {
                hs.put(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1,4 };
        if (containsDuplicate(nums)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
