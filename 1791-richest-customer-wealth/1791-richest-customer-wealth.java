class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int rowLen = accounts.length;
        int colLen = accounts[0].length;
        for (int i = 0; i < rowLen; i++) {
            int sum = 0;
            for (int j = 0; j < colLen; j++) {
                sum = sum + accounts[i][j];
                if (sum > maxWealth) {
                    maxWealth = sum;
                }
            }
        }
        return maxWealth;
    }
}