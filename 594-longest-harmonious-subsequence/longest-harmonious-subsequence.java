class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int maxLen = 0;
        for (int n : nums) {
            if (freq.containsKey(n + 1)) {
                int len = freq.get(n) + freq.get(n + 1);
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
