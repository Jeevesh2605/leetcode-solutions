class Solution:
    def func(self, i, dp):
        if i == 0 or i == 1:
            return 1
        if dp[i] != -1:
            return dp[i] 
        dp[i] = self.func(i - 1, dp) + self.func(i - 2, dp)
        return dp[i]

    def climbStairs(self, n: int) -> int:
        dp = [-1] * (n + 1)
        return self.func(n, dp)