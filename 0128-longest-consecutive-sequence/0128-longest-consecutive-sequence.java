class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int head;
        int maxLength = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                head = num;
                while(set.contains(head+1)){
                    head++;
                    count++;
                }
                maxLength = Math.max(count,maxLength);
                count = 1;
            }
        }
        
        
        
        return maxLength;
    }
}