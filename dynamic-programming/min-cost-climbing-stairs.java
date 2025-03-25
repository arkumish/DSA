class Solution {
    //it is kind of find f(n) --> min(f(n-1),f(n-2)) + cos[n]
    //with top down memo dp
    private int minCost(int[] cost,int n,int[] dp ){
        //base
        if(dp[n]!=-1)
         return dp[n];
        if(n==0)
         return cost[0];
        if(n==1)
         return cost[1];
        
        dp[n] = Math.min(minCost(cost,n-1,dp), minCost(cost,n-2,dp)) +  cost[n];

        return dp[n];
        
    }
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
       

        return Math.min(minCost(cost,n-1,dp), minCost(cost,n-2,dp));
    }
}

//--------------------------------

//With recursion only (but will give TLE)

class Solution {
    //it is kind of find f(n) --> min(f(n-1),f(n-2)) + cos[n]
    private int minCost(int[] cost,int n){
        //base
        if(n==0)
         return cost[0];
        if(n==1)
         return cost[1];

        return Math.min(minCost(cost,n-1), minCost(cost,n-2)) +  cost[n];
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost,n-1), minCost(cost,n-2));
    }
}