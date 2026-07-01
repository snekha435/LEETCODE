class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pf = new int[nums.length];
        int[] sf = new int[nums.length];
        
        pf[0]=nums[0];
        for(int i=1;i<nums.length;i++){
             pf[i] = pf[i - 1] + nums[i];
        }
        sf[n- 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sf[i] = sf[i + 1]  + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : pf[i - 1];
            int rightSum = (i == n - 1) ? 0 : sf[i + 1];

            if (leftSum == rightSum) return i;
        }
        return -1;
        
    }
}