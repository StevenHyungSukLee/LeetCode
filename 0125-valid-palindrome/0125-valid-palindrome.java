class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;

        s = s.toLowerCase();
        while(a < b){
            while( (a<b) && !((s.charAt(a)<='z'&&s.charAt(a)>='a') || Character.isDigit(s.charAt(a)) == true)){
                a++;
            }
            while((a<b)&&!((s.charAt(b)<='z'&&s.charAt(b)>='a') || Character.isDigit(s.charAt(b))== true)){
                b--;
            }
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }else{
                a++;
                b--;
            }
        }
        
        return true;
    }
}