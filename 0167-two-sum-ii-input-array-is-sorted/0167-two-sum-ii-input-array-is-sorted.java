class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length-1;
        while((a < b) && b < numbers.length){
            
            if((target - numbers[b]) == numbers[a]){
                return new int[] {a+1, b+1};
            }else if(numbers[a]+numbers[b] < target){
                a++;
            }else{
                b--;
            } 
        }
        return new int[] {};
    }
}