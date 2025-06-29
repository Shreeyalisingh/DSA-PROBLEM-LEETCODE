class Solution {
    public static int divide(int dividend, int divisor) {
        int s = 1;
        if ((dividend < 0) != (divisor < 0)) {
            s = -1;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long t = 0;

        while (a >= b) {
            int c = 0;
            while (a >= (b << (c + 1))) {
                c++;
            }
            t += 1L << c;
            a -= b << c;
        }

        long r = s * t;
        if (r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE) {
            return (int) r;
        }
        return Integer.MAX_VALUE;
    }
}