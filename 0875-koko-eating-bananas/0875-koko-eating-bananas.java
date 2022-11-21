class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        int result = 0;
        
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > r){
                r = piles[i];
            }
        }
        while(l < r){
            int mid = l+(r-l)/2;
            result = 0;
            for(int i = 0; i < piles.length; i++){
                    result += (int)Math.ceil((double)piles[i]/mid);
                // if(result > h){
                //     l = mid;
                //     break;
                // }
            }
            
            if(result <= h){
                r = mid;
            }else if(result> h){
                l = mid+1; 
            }
                
            result = r;
        }
        return result;
    }
}