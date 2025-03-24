class Solution {
    /*
    78. Subsets
    print all subset, take, not take method, call 

    base condition : if(index==n)  add array to final array ; return ;
    addnum
    //take call
    //remove last added
    //not take call

    */
    private void fxn(int ind, int[] nums, List<List<Integer>> finalArray, List<Integer> currArr ){

        if(ind==nums.length){
            finalArray.add(new ArrayList<>(currArr)); // keep in mind, as java takes as reference, so directly adding while handle all future values
            return;
        }
        
        //take
        currArr.add(nums[ind]);
        fxn(ind+1,nums, finalArray, currArr);
        
        //not take
        currArr.remove(currArr.size()-1);
        fxn(ind+1,nums, finalArray, currArr);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalArray = new ArrayList<>();

         fxn(0,nums, finalArray, new ArrayList<>());

         return finalArray;

        
    }
}