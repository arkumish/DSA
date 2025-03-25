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




*/