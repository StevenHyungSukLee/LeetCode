class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        
        int max = 0;
        String result = "";
        
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                 if(right-left+1 > max){
                     result = s.substring(left,right+1);
                     max = right-left+1;
                 }
                left -=1;
                right +=1;
            }
            
            left = i;
            right = i+1;
            
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                 if(right-left+1 > max){
                     result = s.substring(left,right+1);
                     max = right-left+1;
                 }
                left -=1;
                right +=1;
            }
        }
        return result;
    }
}