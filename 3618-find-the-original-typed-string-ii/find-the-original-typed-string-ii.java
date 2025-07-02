class Solution {
  public int possibleStringCount(String word, int k) {
    List<Integer> groupList = getConsecutiveLetters(word);
    final int totalWays =
        (int) groupList.stream().mapToLong(Integer::longValue).reduce(1L, (x, y) -> x * y % MOD);
    if (k <= groupList.size())
      return totalWays;

    int[] ways = new int[k];
    ways[0] = 1;

    for (int i = 0; i < groupList.size(); ++i) {
      int[] nextWays = new int[k];
      int rollingSum = 0;
      int groupSize = groupList.get(i);
      for (int j = i; j < k; ++j) {
        nextWays[j] = (nextWays[j] + rollingSum) % MOD;
        rollingSum = (rollingSum + ways[j]) % MOD;
        if (j >= groupSize)
          rollingSum = (rollingSum - ways[j - groupSize] + MOD) % MOD;
      }
      ways = nextWays;
    }

    final int overcounted = Arrays.stream(ways).reduce(0, (a, b) -> (a + b) % MOD);
    return (totalWays - overcounted + MOD) % MOD;
  }

  private static final int MOD = 1_000_000_007;

  private List<Integer> getConsecutiveLetters(final String word) {
    List<Integer> result = new ArrayList<>();
    int count = 1;
    for (int i = 1; i < word.length(); ++i)
      if (word.charAt(i) == word.charAt(i - 1)) {
        ++count;
      } else {
        result.add(count);
        count = 1;
      }
    result.add(count);
    return result;
  }
}
