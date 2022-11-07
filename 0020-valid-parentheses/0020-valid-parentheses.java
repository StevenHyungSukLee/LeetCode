class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<>();
        
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        if(s.length() <= 1 || s.length()%2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(stack.isEmpty()){
                return false;
            }else{
                if(!stack.isEmpty()){
                    if(stack.peek() == map.get(s.charAt(i))){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}