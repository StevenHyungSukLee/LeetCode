class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int count = 0;
        int max = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                count++;   
            }else{
                set = new HashSet<>();
                count = 1;
                set.add(s.charAt(i));
                int j = i-1;
                while(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    j--;
                    count++;
                }
                
                max = Math.max(max, count);
                
            }
            max = Math.max(max, count);
        }
        
        
        return max;
    }
}