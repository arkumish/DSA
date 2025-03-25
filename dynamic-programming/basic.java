/*
Dynamic Programming : it kind of recursion but normal stack call, will get full/and fail and u will get TLE for big case.

Feel time :

Feel 1  think recursion logic first, evaluate whether this problem can be solve as 
   1) sub problem
   2) each sub problem had there solution. 

Feel 2 : for recursion, create recursion tree, handling cases  (two child, multi child) based on question 
           (give time in this, as this the main thinking block)

Feel 3 :See recursion, drive common pattern (i.e sub problem) 
       try to 
       write basic recurison fxn with base condition
      

Action time : 

write recursion code, 
feel like it will fail (TLE). try thinking for storing *** already calculated steps;

eg : in fibonacci

for f(5) --> f(4) + f(3)
    f(4) --> f(3) + f(2)
    f(3) --> f(2) + f(1)

    now we can store f(3). f(2)....as getting calculate many time

   
Two approaches : (of DP)

1: Top down (memoization)
2: Botton Up (tabulation)


Top to down : u do recursion with storing data somewhere
bottom up : u do not recursion, but some kind of looping iteration using storing data somewhere


eg : fibo
------------------------------------------------------------------------------
Top to down : 

public int fxn(int n,int[] dp){
 
 if(n==0) return 0;  //base case
 if(n==1) return 1;
 
  if(dp[n]!=-1)
   return dp[n];
 
 dp[n] = fxn(n-1,dp) + fxn(n-2,dp);

 return dp[n];

}

pvsm(){

int[] dp = new int[n+1];
Arrays.fill(dp, -1);

fxn(n,dp);

return dp[n];

}

----------------------------------------------------------------

Bottom Up :

pvsm(){

 int[] dp = new int[n+1];
 Arrays.fill(dp,-1);

 dp[0]=0;
 dp[1]=1;

 for(int i=2;i<=n;i++)
  dp[i] = dp[i-1] + dp[i-2];

return dp[n]


-----------------------------------------------------------

for improving theese (space complexity), u can try 3 variable 

public static int fxn(int n) {
    if (n == 0) return 1;
    if (n == 1) return 0;

    int prev2 = 1, prev1 = 0, curr = 0;

    for (int i = 2; i <= n; i++) {
        curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }

    return curr;
}

 ------------------------------------------------------------

  HAPPY CODING

  -------------------------------------------


}




*/