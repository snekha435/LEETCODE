class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            int temp = num;
            int maxDigit = 0;
            int digits = 0;

            while (temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                temp /= 10;
                digits++;
            }

            int encrypted = 0;
            for (int i = 0; i < digits; i++) {
                encrypted = encrypted * 10 + maxDigit;
            }

            sum += encrypted;
        }

        return sum;
    }
}