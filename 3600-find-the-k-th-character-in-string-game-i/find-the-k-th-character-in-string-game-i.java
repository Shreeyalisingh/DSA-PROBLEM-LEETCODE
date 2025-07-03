class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        
        while (sb.length() < k) {
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                char c = sb.charAt(i);
                char nextChar = (char)((c - 'a' + 1) % 26 + 'a');
                sb.append(nextChar);
            }
        }
        
        return sb.charAt(k - 1);
    }
}
