class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Step 2: Calculate differences dynamically
        for (int i = 0; i < n; i++) {
            // rightSum for index i is: totalSum - leftSum - nums[i]
            int rightSum = totalSum - leftSum - nums[i];
            
            // Store the absolute difference
            answer[i] = Math.abs(leftSum - rightSum);
            
            // Update leftSum for the next index
            leftSum += nums[i];
        }
        
        return answer;
    }
}