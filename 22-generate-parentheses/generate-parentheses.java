class Solution {
    private List<String> res = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        gen(0, 0, "");
        return res;
    }

    private void gen(int o, int c, String s) {
        if (o > n || c > n || o < c) return;
        if (o == n && c == n) {
            res.add(s);
            return;
        }
        gen(o + 1, c, s + "(");
        gen(o, c + 1, s + ")");
    }
}
