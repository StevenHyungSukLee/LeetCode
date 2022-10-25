class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        
        for(int a = 0; a < nums.length-2; a++){
            int b = a+1;
            int c = nums.length-1;
            if(a == 0 || !(nums[a] == nums[a-1])){
                while(b<c){
            
            int sum = nums[b]+nums[c];
                if(sum == (0 - nums[a])){
                    
                    result.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    while(b<c&&nums[b]==nums[b+1]) {b++;}
                    while(b<c&&nums[c]==nums[c-1]) {c--;}
                    b++;
                    c--;
                    
                }else if(sum < (0 - nums[a])){
                    b++;
                }else if(sum > (0 - nums[a])){
                    c--;
                }
            
            }
        }
  
            }
            
            
        
        return result;
    }
}