//question : to find all possible sum of subsets 
/*
Input: arr[] = [2, 3]
Output: [0, 2, 3, 5]

https://www.geeksforgeeks.org/problems/subset-sums2234/1


LOGIC: just do Take, Not take method

base condition : if (ind == N)
take : fxn(ind+1, sum+a[ind], N, arra, subSet)
not take : fxn(ind+1, sum,N, arra, subSet)


draw tree to understand better

*/
class Solution {
    private void fxn(int ind, int sum,int[] arr, ArrayList<Integer> subSetSum){
        if(ind == arr.length){
            subSetSum.add(sum);
            return;
        }
        
        //take
        fxn(ind+1, sum + arr[ind], arr, subSetSum);
        
        //not take
        fxn(ind+1, sum, arr, subSetSum);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer>subSetSum = new ArrayList<>();
        
        fxn(0,0,arr,subSetSum);
        
        Collections.sort(subSetSum);
        
        return subSetSum;
        // code here
    }
}