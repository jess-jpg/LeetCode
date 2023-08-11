class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            int match = magazine.indexOf(ransomNote.charAt(i));
            
            if (match == -1) {
                return false;
            } 
            StringBuilder sb = new StringBuilder(magazine);
            sb.deleteCharAt(match);
            magazine = sb.toString();
            
        }
        return true;
    }
}