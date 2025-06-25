class Solution {
  public long kthSmallestProduct(int[] a, int[] b, long k) {
    List<Integer> n1 = new ArrayList<>(), p1 = new ArrayList<>();
    List<Integer> n2 = new ArrayList<>(), p2 = new ArrayList<>();

    split(a, n1, p1);
    split(b, n2, p2);

    long neg = (long) n1.size() * p2.size() + (long) p1.size() * n2.size();
    int s = 1;

    if (k > neg) {
      k -= neg;
    } else {
      k = neg - k + 1;
      s = -1;
      List<Integer> tmp = n2; n2 = p2; p2 = tmp;
    }

    long l = 0, r = (long) 1e10;
    while (l < r) {
      long m = (l + r) / 2;
      if (cnt(n1, n2, m) + cnt(p1, p2, m) >= k)
        r = m;
      else
        l = m + 1;
    }

    return s * l;
  }

  void split(int[] arr, List<Integer> neg, List<Integer> pos) {
    for (int x : arr)
      if (x < 0) neg.add(-x);
      else pos.add(x);
    Collections.reverse(neg);
  }

  long cnt(List<Integer> x, List<Integer> y, long m) {
    long res = 0;
    int j = y.size() - 1;
    for (long a : x) {
      while (j >= 0 && a * y.get(j) > m) --j;
      res += j + 1;
    }
    return res;
  }
}
