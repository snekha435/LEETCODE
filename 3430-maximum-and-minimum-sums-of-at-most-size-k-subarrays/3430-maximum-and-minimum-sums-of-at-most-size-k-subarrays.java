import java.util.*;

class Solution {

    public long minMaxSubarraySum(int[] nums, int k) {
        long ans = 0;
        ans += contribution(nums, k, true);   // maximums
        ans += contribution(nums, k, false);  // minimums
        return ans;
    }

    private long contribution(int[] nums, int k, boolean isMax) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        // Previous greater/smaller
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                    (isMax ? nums[st.peek()] <= nums[i]
                           : nums[st.peek()] >= nums[i])) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Next greater/smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                    (isMax ? nums[st.peek()] < nums[i]
                           : nums[st.peek()] > nums[i])) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long res = 0;

        for (int i = 0; i < n; i++) {
            long l = Math.min(i - left[i], k);
            long r = Math.min(right[i] - i, k);

            long extra = Math.max(0L, l + r - 1 - k);
            long count = l * r - extra * (extra + 1) / 2;

            res += count * nums[i];
        }

        return res;
    }
}