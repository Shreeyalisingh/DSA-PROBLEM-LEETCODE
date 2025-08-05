class S {
    final int n;
    final int[] t;
    public S(int[] a) {
        n = a.length;
        t = new int[n * 4];
        b(a, 0, 0, n - 1);
    }
    void u(int i, int v) {
        u(0, 0, n - 1, i, v);
    }
    int q(int v) {
        return q(0, 0, n - 1, v);
    }
    void b(int[] a, int k, int l, int r) {
        if (l == r) {
            t[k] = a[l];
            return;
        }
        int m = (l + r) / 2;
        b(a, 2 * k + 1, l, m);
        b(a, 2 * k + 2, m + 1, r);
        t[k] = Math.max(t[2 * k + 1], t[2 * k + 2]);
    }
    void u(int k, int l, int r, int i, int v) {
        if (l == r) {
            t[k] = v;
            return;
        }
        int m = (l + r) / 2;
        if (i <= m) u(2 * k + 1, l, m, i, v);
        else u(2 * k + 2, m + 1, r, i, v);
        t[k] = Math.max(t[2 * k + 1], t[2 * k + 2]);
    }
    int q(int k, int l, int r, int v) {
        if (t[k] < v) return -1;
        if (l == r) {
            u(l, -1);
            return l;
        }
        int m = (l + r) / 2;
        return t[2 * k + 1] >= v ? q(2 * k + 1, l, m, v) : q(2 * k + 2, m + 1, r, v);
    }
}

class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int c = 0;
        S s = new S(b);
        for (int x : f) if (s.q(x) == -1) ++c;
        return c;
    }
}

