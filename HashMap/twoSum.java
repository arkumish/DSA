/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

logic : in one go, keep adding, if u find compliment return else add

ps : if using 2 loops, like in first creating hashmap, second checking condtion, it will fail for duplicates, as need to extra check like hm.get(target-nm[i]) ! = i;  eg : [3,3]


*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];

            if(hm.containsKey(comp))
              return new int[]{i, hm.get(comp)};
            
            hm.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}