class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        char maxChar = '\0';
        int maxi = -1;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > maxi || (count == maxi && c < maxChar)) {
                maxi = count;
                maxChar = c;
            }
        }
        return maxChar;
    }
}