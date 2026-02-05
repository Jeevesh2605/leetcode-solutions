class Solution{
    public int[] maxSlidingWindow(int[] nums,int k){
        int n=nums.length;
        int[] ans=new int[n-k+1];
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int i=0;
        for(int j=0;j<n;j++){
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[j])
                dq.pollLast();
            dq.offerLast(j);
            if(dq.peekFirst()<=j-k)
                dq.pollFirst();
            if(j>=k-1){
                ans[i]=nums[dq.peekFirst()];
                i++;
            }
        }
        return ans;
    }
}