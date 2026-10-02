class Solution {
    public int knapsack01(int[] wt, int[] val, int n, int W) {
        int[][] memo = new int[n + 1][W+1];
        for(int[] arr : memo) Arrays.fill(arr,-1);
        return solve(memo,wt,val,n - 1,W);
    }

    int solve(int[][] memo,int[] wt, int[] val, int idx, int c){
        if(idx == 0){
            if(c - wt[0] >= 0){
                return val[0];
            }
            return 0;
        }
        if(memo[idx][c] != -1) return memo[idx][c];
        int nt = solve(memo,wt,val,idx - 1,c);
        int t = 0;
        if(c - wt[idx] >= 0){
            t = val[idx] + solve(memo,wt,val,idx - 1,c - wt[idx]);
        }
        return memo[idx][c] = Math.max(t,nt);
    }
}
