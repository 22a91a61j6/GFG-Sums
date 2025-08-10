// User function Template for Java

class Solution {
    static String findLargest(int n, int s) {
        // code here
        if (s == 0) {
            return (n == 1) ? "0" : "-1";
        }
        if (s > 9 * n) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(s >= 9){
                sb.append('9');
                s -= 9;
            }
            else{
                sb.append((char)('0' + s));
                s = 0;
            }
        }
        return sb.toString();
    }
}