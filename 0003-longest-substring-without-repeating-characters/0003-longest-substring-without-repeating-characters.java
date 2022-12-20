class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
       
        if(s.length()==0 ||s.length()==1){
            return s.length();
        }
        while(l <= r && r <=s.length()-1){
            
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(max, r-l+1);
                r++;
            }else{
                max = Math.max(max, r-l);
                while(s.charAt(l) != s.charAt(r)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
            }
            
        }
        
        return max;
    }
}