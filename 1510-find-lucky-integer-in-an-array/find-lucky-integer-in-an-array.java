class Solution {
    public int findLucky(int[] arr) {
        int[] c = new int[501];
        for (int x : arr) {
            ++c[x];
        }
        for (int x = c.length - 1; x > 0; --x) {
            if (x == c[x]) {
                return x;
            }
        }
        return -1;
    }
}