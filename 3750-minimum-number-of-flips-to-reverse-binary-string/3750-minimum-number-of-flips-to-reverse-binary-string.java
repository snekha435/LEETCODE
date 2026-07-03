class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);

        int flips = 0;
        int m = s.length();

        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != s.charAt(m - 1 - i)) {
                flips++;
            }
        }

        return flips / 1;
    }
}