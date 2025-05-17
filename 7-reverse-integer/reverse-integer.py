class Solution:
    def reverse(self, x: int) -> int:
        temp=x
        if(x<0):
            x=x*-1
        rev=0
        while(x>0):
            rem=x%10
            rev=rev*10+rem
            x=x//10
        if rev<-2**31 or rev>2**31:
            return 0
        if(temp<0):
            return rev*-1
        else:
            return rev       
        

        