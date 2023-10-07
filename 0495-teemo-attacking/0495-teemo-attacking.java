class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = 0;

        // for loop for all elements in timeSeries except the last
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // the next time not affecting the duration here then add full duration
            if (timeSeries[i+1] - timeSeries[i] >= duration) {
                totalTime = totalTime + duration;
            } else {
                totalTime = totalTime + (timeSeries[i+1] - timeSeries[i]);
            }
        }
        // the last one will always be unrestricted
        return totalTime + duration;
    }
}