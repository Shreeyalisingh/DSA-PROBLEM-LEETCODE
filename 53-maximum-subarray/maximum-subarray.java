class Solution {
    public int maxSubArray(int[] arr) {

        int current = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(current + arr[i], arr[i]);
            maximum = Math.max(maximum, current);
        }

        return maximum;
        
    }
}