class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int hi = matrix[0].length-1;
        int lo = 0;
        int mid = 0;
        int arr = 0;
        int hi1 = matrix.length-1;
        int lo1 = 0;
        
        while(lo1 <= hi1){
            int mid1 = (lo1+hi1)/2;
            if(target == matrix[mid1][0]){
                return true;
            }
            if(target >= matrix[mid1][0] && target <= matrix[mid1][matrix[mid1].length-1]){
                arr = mid1;
                break;
            }else if(target > matrix[mid1][matrix[mid1].length-1]){
                lo1 = mid1+1;
            }else if(target < matrix[mid1][0]){
                hi1 = mid1-1;
            }
        }

        
        while(lo <= hi){
            
            mid = (lo+hi)/2;
            
            if(target == matrix[arr][mid]){
                return true;
            }else if(target < matrix[arr][mid]){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return false;
    }
}