/*


its a game to find the element from sorted order 

public void binary_search(int[] nums, int target){

Arrays.sort(nums);
int n = nums.length;

int low = 0, high = n-1;
int mid;

while( low < high){

    mid = (low + high)/2;

    if(nums[mid]==target)
      return mid;
    else if (nums[mid] > target){
       high = mid - 1;
    }else{
       low = mid +1;
    }

}

return -1;

}



//if u dealing with very high int value INT+MAX
mid = ( int_max + int_max ) /2

so cant store 2*int_max

------------------------------------------
mid = low + (high-low)/2

---------------------------------------------








*/