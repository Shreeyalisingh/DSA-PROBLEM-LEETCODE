class Solution {
    public int minMaxDifference(int num) {

        String s = String.valueOf(num);
        char x = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                x = c;
                break;
            }
        }
        String a = x == ' ' ? s : s.replace(x, '9');
        int mx = Integer.parseInt(a);
        char y = s.charAt(0);
        String b = s.replace(y, '0');
        int mn = Integer.parseInt(b);
        return mx - mn;
        
    }
}