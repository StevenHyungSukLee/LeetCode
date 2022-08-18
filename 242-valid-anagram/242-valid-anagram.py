class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
      
        Sletters = list(s)
        Tletters = list(t)
        
        a = sorted(Sletters)
        b = sorted(Tletters)
        
        if a == b:
            return True
     