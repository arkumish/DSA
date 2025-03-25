/*
House robber but with all housed in circular way

now first and last house cant be togther
so two cases
1:   go from 0 to n-1
2:   go from 1 to n


do house robber for each, return max of both


*/

class Solution {

    private int fxn(int[] nums, int n, int[] dp,int st){

        if(n<0) return 0;
        if(dp[n]!=-1)  return dp[n];

        if(n==0) return st==0 ? nums[0] : 0;
        if(n==1) return st==0 ?  Math.max(nums[1], nums[0]) : nums[1];

        dp[n] = Math.max(nums[n] + fxn(nums,n-2,dp,st), fxn(nums,n-1,dp,st));
        return dp[n];
    }
    public int rob(int[] nums) {
        if(nums.length ==1)
         return nums[0];
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        int a =  fxn(nums, n -2, dp,0);
        Arrays.fill(dp,-1);
        int b =  fxn(nums, n-1 , dp,1);

        return Math.max(a,b);
    }
}



//-----------------------
//to understand better

class Solution {

    private int fxn(int[] nums, int n, int[] dp,int st){
       //this part only
       if(st==1){
         if(n<=0) return 0;
         if(n==1) return nums[1];
       }
       if(st==0){
         if(n < 0) return 0; 
          if(n == 0) return nums[0];
          if(n == 1) return Integer.max(nums[1], nums[0]);
       }
      


       if(dp[n]!=-1)
        return dp[n];

        dp[n] = Math.max(nums[n] + fxn(nums,n-2,dp,st), fxn(nums,n-1,dp,st));
        return dp[n];
    }
    public int rob(int[] nums) {
        if(nums.length ==1)
         return nums[0];
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        int a =  fxn(nums, n -2, dp,0);
        Arrays.fill(dp,-1);
        int b =  fxn(nums, n-1 , dp,1);

        return Math.max(a,b);
    }
}