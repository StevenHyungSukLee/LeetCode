class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int head;
        int maxLength = 0;
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            // if(map.containsKey(nums[i])){
            //     continue;
            // }else if(map.containsKey(nums[i]-1)){
            //     map.get(nums[i]-1).add(nums[i]);
            //     // map.put(nums[i]-1, nums[i]);
            // }else if(map.containsKey(nums[i]+1)){
            //     List<Integer> list = new ArrayList<>();
            //     list.add(nums[i]+1);
            //     map.put(nums[i], list);
            // }else{
            //     List<Integer> list = new ArrayList<>();
            //     map.put(nums[i],list);
            // }
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