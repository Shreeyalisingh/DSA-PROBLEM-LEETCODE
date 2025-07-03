class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), output);
        return output;
    }

    private void helper(int[] candidates, int idx, int target, List<Integer> path, List<List<Integer>> output) {
        if (target == 0) {
            output.add(new ArrayList<>(path));
            return;
        }
        if (target < 0 || idx >= candidates.length) {
            return;
        }

        path.add(candidates[idx]);
        helper(candidates, idx, target - candidates[idx], path, output);
        path.remove(path.size() - 1);

        helper(candidates, idx + 1, target, path, output);
    }
}
