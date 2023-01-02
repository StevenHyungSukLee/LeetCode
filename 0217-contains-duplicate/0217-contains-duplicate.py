class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        list = set()
        
        for j in nums:
            if j in list:
                return True
            else: 
                list.add(j)