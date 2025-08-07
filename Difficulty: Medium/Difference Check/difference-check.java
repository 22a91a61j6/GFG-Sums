class Solution {
    public int minDifference(String[] arr) {
        //code here
        int[] times = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            String[] parts = arr[i].split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);
            times[i] = h * 3600 + m * 60 + s;
        }
        Arrays.sort(times);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < times.length; i++){
            min = Math.min(min, times[i] - times[i - 1]);
        }
        int wrapDiff = 86400 - times[arr.length - 1] + times[0];
        return Math.min(min, wrapDiff);
    }
}
