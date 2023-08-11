class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(s.length() - 1 - i) == ' ') {
                if (count == 0) {
                    continue;
                }
                return count;
            }
            count++;
        }
        return count;
    }
}