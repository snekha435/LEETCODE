import java.util.HashSet;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;

        // Check for arithmetic triplets
        for (int num : nums) {
            if (set.contains(num + diff) && set.contains(num + 2 * diff)) {
                count++;
            }
        }

        return count;
    }
}