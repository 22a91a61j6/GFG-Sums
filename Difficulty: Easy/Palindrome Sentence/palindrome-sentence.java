class Solution {
    public boolean isPalinSent(String s) {
        //code here
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
