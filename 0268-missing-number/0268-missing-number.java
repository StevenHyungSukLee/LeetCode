class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        int j = 0;
        while(set.contains(j)){
            j++;
        }
        
        return j;
    }
}