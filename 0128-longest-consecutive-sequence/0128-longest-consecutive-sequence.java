class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> num_set = new HashSet<Integer>();
//         for (int num : nums) {
//             num_set.add(num);
//         }

//         int longestStreak = 0;

//         for (int num : num_set) {
//             if (!num_set.contains(num-1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (num_set.contains(currentNum+1)) {
//                     currentNum += 1;
//                     currentStreak += 1;
//                 }

//                 longestStreak = Math.max(longestStreak, currentStreak);
//             }
//         }

//         return longestStreak;
//     }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int maxLength = 0;
        for(int num : nums){
            set.add(num);
        }
        // for(int i = 0; i < nums.length; i++){
        //     set.add(nums[i]);
        // }
        for(int num:nums){
            if(!set.contains(num-1)){
                int count = 1;
                int head = num;
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