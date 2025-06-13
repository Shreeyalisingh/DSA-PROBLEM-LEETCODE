class Solution {
    public int romanToInt(String s) {
        int[] m = new int[26];
        m['I' - 'A'] = 1;
        m['V' - 'A'] = 5;
        m['X' - 'A'] = 10;
        m['L' - 'A'] = 50;
        m['C' - 'A'] = 100;
        m['D' - 'A'] = 500;
        m['M' - 'A'] = 1000;
        
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            int v = m[s.charAt(i) - 'A'];
            if (i < s.length() - 1 && v < m[s.charAt(i + 1) - 'A']) r -= v;
            else r += v;
        }
        return r;
    }
}
