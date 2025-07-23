class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return helper(s, 'a', 'b', x, y);
        } else {
            return helper(s, 'b', 'a', y, x);
        }
    }

    private int helper(String s, char first, char second, int firstPoints, int secondPoints) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && ch == second) {
                stack.pop();
                score += firstPoints;
            } else {
                stack.push(ch);
            }
        }

        Stack<Character> temp = new Stack<>();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            if (!temp.isEmpty() && ch == second && temp.peek() == first) {
                temp.pop();
                score += secondPoints;
            } else {
                temp.push(ch);
            }
        }

        return score;
    }
}
