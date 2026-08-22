class Solution(object):
    def checkDivisibility(self, n):
        """
        :type n: int
        :rtype: bool
        """
        original=n
        sum=0
        product=1
        while n>0:
            digit = n%10
            sum+=digit
            product*=digit
            n//=10
        divisor = sum+product
        return original%divisor==0