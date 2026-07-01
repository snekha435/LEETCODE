class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0; // Starts at 0 because the biker begins at altitude 0

        for (int g : gain) {
            currentAltitude += g; // Calculate altitude at the next point
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude; // Update maximum if current is higher
            }
        }

        return maxAltitude;
    }
}