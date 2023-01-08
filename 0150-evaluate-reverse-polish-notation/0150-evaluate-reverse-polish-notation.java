class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String token:tokens){
            if(!"+-/*".contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            
            int b = stack.pop();
            int a = stack.pop();
            
            int result = 0;
            
            switch(token){
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a*b;
                    break;
                case "/":
                    result = a/b;
                    break;
            }
            
            stack.push(result);
        }
        return stack.pop();
    }
}