package ArrayAndHashing;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i :
                nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i :
                map.values()) {
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num :
                nums) {
            set.add(num);
        };
        return nums.length == set.size();
    }

    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num :
                nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        };
        return false;
    }

}
