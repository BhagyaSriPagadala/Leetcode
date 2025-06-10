class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        e=0
        for i in range(0,len(nums)):
            if(nums[i]%2==0):
                nums[i],nums[e]=nums[e],nums[i]
                e+=1
        return nums
        