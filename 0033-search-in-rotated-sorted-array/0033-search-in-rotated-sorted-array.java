class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        
        while(l <= r){
            int mid = (l+r)/2;
            
            if(nums[l] <= nums[mid]){
                if(target == nums[mid]){
                    return mid;
                }
                if(target < nums[mid]){
                    if(target == nums[l]){
                    return l;
                    }
                    if(target < nums[l]){
                        l = mid+1;
                    }else{
                        r = mid-1;
                    }
                }else{
                    l = mid+1;
                }
            }else{
                if(target == nums[mid]){
                    return mid;
                }
                if(target < nums[mid]){
                    
                    if(target < nums[l]){
                        r = mid-1;
                    }else{
                        l = mid+1;
                    }
                }else if(target > nums[mid]){
                    if(target <= nums[r]){
                        l = mid +1;
                    }else{
                        r = r-1;
                    }
                    
                }
            }
        }
        return -1;
    }
}