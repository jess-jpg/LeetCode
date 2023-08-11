class Solution {
    public int strStr(String haystack, String needle) {
        // if (!haystack.contains(needle)) {
        //     return -1;
        // }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1; // never matches
    }
}