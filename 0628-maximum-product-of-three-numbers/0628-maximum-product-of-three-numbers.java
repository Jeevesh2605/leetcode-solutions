class Solution1 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(
            nums[n-1]*nums[n-2]*nums[n-3],
            nums[n-1]*nums[0]*nums[1]
        );
    }
}


class Solution{
    public int maximumProduct(int[] nums){
        int a = -1001, b=a, c=b;
        int x=1001, y=x;
        for(int num:nums){
            int pa=a,pb=b,px=x;
            a=Math.max(a,num);
            b=Math.max(b, Math.min(pa,num));
            c=Math.max(c,Math.min(pb,num));
            x = Math.min(x,num);
            y = Math.min(y, Math.max(px,num));
        }
        return Math.max(a*b*c, a*x*y);
    }
}