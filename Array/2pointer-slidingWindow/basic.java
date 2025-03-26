/*

two pointer and sliding window is helping when solving in certian frame of question

FEW CASES :

------------------------------------------------------------------------------------------
1) CONSTANT WINDOW

-1,2,3,3,4,5-1

k=4, find max sum in this k frame

we can think of making a window, and using 2 pointer l, r to move

int l=0, r=k-1,sum=0;

while(r<n){

 sum = sum - a[l];
 l++;
 r++;
 sum = sum + a[r];

 maxSum = max(sum,maxSum);

}
-----------------------------------------------------------------------------------------------

2) LONGEST SUBARRAY WITH sum <=k

//kind of dynamic window ---expand, shrink       logic

k=14

2, 5 ,1, ,10, 10

int l=0,r=0,maxLen=0, sum=0;

while(r < n){

sum = sum + a[r];
r++;
  while(sum > k){
    sum = sum - a[l];
    l++;
  }

  if(sum <= k){
  maxLen  = max(maxLen, sum);
  }

-----------------------------------------------------------------------------------------------------

3) NO OF SUBARRAY WITH CONDITION 

no of subarray with sum = k
--> no of subarray with sum <=k
--> no of subarray with sum <=k-1

differnet of above two = answer
------------------------------------------------------------------------------------------------

4) SHORTES/MIN WINDOW CONDITION

}









*/