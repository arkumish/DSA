/*
Now understanding this question is little tricky, it took to sufficient time to digest the correct approach, but let me try

2,7,9,3,1

roober cant visit adjact house

so at each step he chhose 
fn(n) = max(a[n] + fn(n+2 ---> n) , fn(n+1 ----n))

means for index n, it can select that + any best from n+2 to n  OR any best from n+1 to n

so we have subproblem and overlapping

for fn(n+2--->n) : we can process all pre step and provide best among all

so, we will iterate reverse
top down;
fn(n) = max(a[n] + fn(n-2) , fn(n-1))

at each step you can either 
select it : a[n] + fn(n-2)
or pass it : fn(n-1)

based on whther u getting max of not.

base condition

if(n<0) return 0;
if(n==0) return a[0];
if(n==1) return max(a[0],a[1])
*/


class Solution {

    private int fxn(int[] nums, int n, int[] dp){
       if(n < 0) return 0; 
       if(n == 0) return nums[0];
       if(n == 1) return Integer.max(nums[1], nums[0]);


       if(dp[n]!=-1)
        return dp[n];

        dp[n] = Math.max(nums[n] + fxn(nums,n-2,dp), fxn(nums,n-1,dp));
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return fxn(nums, n -1, dp);  //n-1 as we are element exist at a[n-1]
    }
}


//---------------------------------------
//only recursion

class Solution {

    private int fxn(int[] nums, int n){
       if(n < 0) return 0; 
       if(n == 0) return nums[0];
       if(n == 1) return Integer.max(nums[1], nums[0]);

        return Math.max(nums[n] + fxn(nums,n-2), fxn(nums,n-1));
    }
    public int rob(int[] nums) {
        

        return fxn(nums, nums.length -1 );
    }
}