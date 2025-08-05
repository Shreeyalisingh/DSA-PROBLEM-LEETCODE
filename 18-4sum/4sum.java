class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        List<List<Integer>> res = new ArrayList<>();
        if (a == null || a.length < 4) return res;
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j != i + 1 && a[j] == a[j - 1]) continue;
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long s = 0L + a[i] + a[j] + a[k] + a[l];
                    if (s < t) k++;
                    else if (s > t) l--;
                    else {
                        res.add(Arrays.asList(a[i], a[j], a[k], a[l]));
                        k++; l--;
                        while (k < l && a[k] == a[k - 1]) k++;
                        while (k < l && a[l] == a[l + 1]) l--;
                    }
                }
            }
        }
        return res;
    }
}

