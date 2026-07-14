class Solution {
    private static final int MOD = 1_000_000_007;
    private Integer[][][] dp;
    private int[] nums;

    public int subsequencePairCount(int[] nums) {
        this.nums = nums;

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        dp = new Integer[nums.length + 1][max + 1][max + 1];

        return dfs(0, 0, 0);
    }

    private int dfs(int index, int gcd1, int gcd2) {

        // Base case
        if (index == nums.length) {
            return (gcd1 == gcd2 && gcd1 != 0) ? 1 : 0;
        }

        if (dp[index][gcd1][gcd2] != null)
            return dp[index][gcd1][gcd2];

        int num = nums[index];

        // Choice 1: Put current number in subsequence 1
        int takeFirst = dfs(
                index + 1,
                gcd(gcd1, num),
                gcd2);

        // Choice 2: Put current number in subsequence 2
        int takeSecond = dfs(
                index + 1,
                gcd1,
                gcd(gcd2, num));

        // Choice 3: Ignore current number
        int skip = dfs(
                index + 1,
                gcd1,
                gcd2);

        long ans = 0;
        ans += takeFirst;
        ans += takeSecond;
        ans += skip;

        ans %= MOD;

        dp[index][gcd1][gcd2] = (int) ans;
        return (int) ans;
    }

    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}