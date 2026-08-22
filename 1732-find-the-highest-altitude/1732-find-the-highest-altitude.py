class Solution(object):
    def largestAltitude(self, gain):
        alt = 0
        mx = 0
        for x in gain:
            alt += x
            mx = max(mx, alt)

        return mx