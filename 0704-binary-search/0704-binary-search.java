class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int mid = (lo+hi)/2;
        
        while(lo <= hi){
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                lo = mid+1;
                mid = (lo+hi)/2;
            }else if(nums[mid] > target){
                hi = mid-1;
                mid = (lo+hi)/2;
            }
        }
        
        return -1;
    }
}