class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < temperatures.length; i++){
           int cur = temperatures[i];
            
            
            while(!stack.isEmpty() && temperatures[stack.peek()] < cur){
                int prev = stack.pop();
                result[prev] = i-prev;
            }
            stack.push(i);
        }
        
        return result;
    }
}