class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            String s = String.valueOf(num);

            // Symmetric integers must have an even number of digits
            if (s.length() % 2 != 0) {
                continue;
            }

            int n = s.length();
            int firstHalf = 0;
            int secondHalf = 0;

            for (int i = 0; i < n / 2; i++) {
                firstHalf += s.charAt(i) - '0';
                secondHalf += s.charAt(i + n / 2) - '0';
            }

            if (firstHalf == secondHalf) {
                count++;
            }
        }

        return count;
    }
}