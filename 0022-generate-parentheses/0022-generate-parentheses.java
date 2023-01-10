class Solution {
    
    Stack<Character> stack = new Stack<>();
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0,0,n);
        return result;
    }
    
    private void backtrack(int open, int close, int n){
        if(open == close && close == n){
            Iterator st = stack.iterator();
            String temp = "";
            while(st.hasNext()){
                temp = temp + st.next();
            }
            result.add(temp);
        }
        if(open < n){
            stack.push('(');
            backtrack(open+1,close,n);
            stack.pop();
        }
        
        if(close < open){
            stack.push(')');
            backtrack(open, close+1,n);
            stack.pop();
        }
    }
}