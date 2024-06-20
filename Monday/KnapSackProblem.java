package Monday;

public class KnapSackProblem {
    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        int[] dp = new int[W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int w = W; w >= 0; w--) {
                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]] + val[i - 1]);
                System.out.print(dp[w] + " ");
            }
            System.out.println(" ");
        }
        return dp[W];
    }
    public static void main(String[] args) {
        int[] profit = { 2,3,1,4 };
        int[] weight = { 3,4,6,5 };
        int W = 8;
        int n = profit.length;
        System.out.print(knapSack(W, weight, profit, n));
    }
}
