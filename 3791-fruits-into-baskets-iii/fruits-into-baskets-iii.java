import java.util.*;

class SegTree {
    int n;
    int[] t;
    SegTree(int[] a) {
        n = a.length;
        t = new int[n * 4];
        bld(a, 0, 0, n - 1);
    }
    void bld(int[] a, int i, int l, int r) {
        if (l == r) {
            t[i] = a[l];
            return;
        }
        int m = (l + r) / 2;
        bld(a, i * 2 + 1, l, m);
        bld(a, i * 2 + 2, m + 1, r);
        t[i] = Math.max(t[i * 2 + 1], t[i * 2 + 2]);
    }
    void upd(int i, int v) {
        upd(0, 0, n - 1, i, v);
    }
    void upd(int i, int l, int r, int x, int v) {
        if (l == r) {
            t[i] = v;
            return;
        }
        int m = (l + r) / 2;
        if (x <= m) upd(i * 2 + 1, l, m, x, v);
        else upd(i * 2 + 2, m + 1, r, x, v);
        t[i] = Math.max(t[i * 2 + 1], t[i * 2 + 2]);
    }
    int qf(int v) {
        return qf(0, 0, n - 1, v);
    }
    int qf(int i, int l, int r, int v) {
        if (t[i] < v) return -1;
        if (l == r) {
            upd(l, -1);
            return l;
        }
        int m = (l + r) / 2;
        if (t[i * 2 + 1] >= v) return qf(i * 2 + 1, l, m, v);
        return qf(i * 2 + 2, m + 1, r, v);
    }
}

class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int r = 0;
        SegTree t = new SegTree(b);
        for (int x : f) if (t.qf(x) == -1) r++;
        return r;
    }
}
