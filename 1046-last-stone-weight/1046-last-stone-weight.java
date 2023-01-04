class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        
        for(int num: stones){
            pq.add(num);
        }
        
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            
            if(x == y){
                continue;
            }else if(x > y){
                pq.add(x-y);
            }else{
                pq.add(y-x);
            }
        }
        
        if(pq.size() == 0) return 0;
        
        return pq.peek();
    }
}