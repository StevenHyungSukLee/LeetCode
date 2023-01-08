class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        
        for(char task:tasks){
            arr[task-'A']++;
        }
        
        int max_freq = 0;
        
        for(int num:arr){
            max_freq = Math.max(max_freq, num);
        }
        
        int mostfreq = 0;
        for(int num:arr){
            if(num == max_freq){
                mostfreq++;
            }
        }
        
        return  Math.max(tasks.length, (n+1)*(max_freq-1) + mostfreq);
    }
}