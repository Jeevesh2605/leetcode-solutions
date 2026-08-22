class Solution(object):
    def countSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans=0
        for i in range(1,len(nums)-1):
            if 2*(nums[i-1]+nums[i+1])==nums[i]:
                ans+=1
        return ans