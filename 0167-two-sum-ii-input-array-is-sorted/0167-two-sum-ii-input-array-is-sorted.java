class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int c = numbers.length-1;
        while((a < c) && c < numbers.length){
            
            if((target - numbers[c]) == numbers[a]){
                return new int[] {a+1, c+1};
            }else if(numbers[a]+numbers[c] < target){
                a++;
            }else{
                c--;
            } 
        }
        return new int[] {};
    }
}