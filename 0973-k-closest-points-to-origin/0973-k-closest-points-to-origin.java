class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> Integer.compare((x[0]*x[0] + x[1]*x[1]), (y[0]*y[0] + y[1]*y[1])));
        
        for(int[] point: points){
            pq.add(point);
        }
        
        int[][] ans = new int[k][2];
        
        for(int i = 0; i < k; i++){
            int[] cur = pq.poll();
            ans[i][0] = cur[0];
            ans[i][1] = cur[1];
        }
        
        return ans;
    }
}