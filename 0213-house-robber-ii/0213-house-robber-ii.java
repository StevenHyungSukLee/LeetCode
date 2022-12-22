class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }else if(nums.length == 3){
            return Math.max(nums[2],Math.max(nums[0],nums[1]));
        }else if(nums.length == 4){
            return Math.max(nums[0]+nums[2], nums[1]+nums[3]);
        }
        
        dp[0] = 0;
        dp[1] = nums[1];
        dp[2] = nums[2];
        dp[3] = nums[1]+nums[3];
        
        int max2 = Math.max(dp[1], dp[2]);
        
        
        for(int i = 4; i < nums.length; i++){
            dp[3] = nums[1]+nums[3];
            dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
            max2 = Math.max(max2, dp[i]);
        }
        
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0]+ nums[2];
        int max1 = Math.max(dp[2],Math.max(dp[0], dp[1]));
        for(int i = 3; i < nums.length-1; i++){
            dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
            max1 = Math.max(max1, dp[i]);
            
        }
        return Math.max(max1,max2);
    }
}