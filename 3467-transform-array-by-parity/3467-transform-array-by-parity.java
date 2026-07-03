class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int oddCount = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        int evenCount = n - oddCount;

        for (int i = 0; i < evenCount; i++) {
            ans[i] = 0;
        }

        for (int i = evenCount; i < n; i++) {
            ans[i] = 1;
        }

        return ans;
    }
}