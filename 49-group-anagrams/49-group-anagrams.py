class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        result = {}
        
        for i in strs:
            key = sorted(i)
            
            if tuple(key) in result:
                result[tuple(key)].append(i)
            else:
                result[tuple(key)] = [i]
                
        return result.values()