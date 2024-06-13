public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // create a loop that goes through the list and finds the difference
        // of the required sum and current number and then stores in hashmap
        // and then see if that new number exists in the list.

        HashMap<Integer, Integer> map = new HashMap();
        int diff;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
