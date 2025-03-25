/*

0,0   to   m-1,n-1

all possible paths, if right or down steps are allowed

Feel : from o,o  
take 1 right : fxn(m,n-1)
take 1 down : fxn(m-1,n)

total path from 0,0 = take 1 right + take 1 down path
                    = fxn(m,n-1)  + fxn(m-1,n)

base condition :
m==1 or n==1
means single row, or single column to travel, hench path = 1;

*/

class Solution {
    private int fxn(int m, int n,int[][] dp){
        if(m==1 || n==1)
         return 1;
        
        if(dp[m][n] != 0)
          return dp[m][n];
        
        dp[m][n] =  fxn(m-1,n,dp) + fxn(m,n-1,dp);
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m+1][n+1];
        return fxn(m,n,dp);
        
    }
}

//--------------------------------------
//basic recursion with TLE
class Solution {
    private int fxn(int m, int n){
        if(m==1 || n==1)
         return 1;
        
        return fxn(m-1,n) + fxn(m,n-1);
    }
    public int uniquePaths(int m, int n) {
        return fxn(m,n);
        
    }
}