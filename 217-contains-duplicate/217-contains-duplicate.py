class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        list = set()
        
        for i in nums:
            if i in list:
                return True
            else: 
                list.add(i)