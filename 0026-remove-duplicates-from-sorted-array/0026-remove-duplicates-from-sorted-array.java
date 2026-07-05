class Solution {
    public int removeDuplicates(int[] nums) {
   
     int high = 1;
     int mid=1;
     while(mid<nums.length){
        if(nums[mid] == nums[mid-1]){
            mid++;
        }else{
            nums[high] = nums[mid];
           
            mid++;
            high++;
        }
     }
     return high;
     
    }
}