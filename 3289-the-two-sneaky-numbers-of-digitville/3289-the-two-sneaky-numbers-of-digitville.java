class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        int[] freq = new int[n];

        for (int num : nums) {
            freq[num]++;
        }

        int[] ans = new int[2];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (freq[i] == 2) {
                ans[idx++] = i;
            }
        }

        return ans;
    }
}