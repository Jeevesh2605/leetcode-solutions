class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        count=0
        maxCount=0
        for i in range(0,len(nums)):
            if nums[i]==1:
                count+=1
            else:
                maxCount = max(maxCount,count)
                count=0
        return max(maxCount,count)
        """
        :type nums: List[int]
        :rtype: int
        """
        