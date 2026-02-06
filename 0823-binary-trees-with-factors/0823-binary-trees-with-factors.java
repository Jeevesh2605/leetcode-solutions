class Solution1 {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Long>map=new HashMap<Integer,Long>();
        long ans=1;
        map.put(arr[0],ans);
        for(int i=1;i<arr.length;i++)
        {
            long sum=1;
            for(int j=0;j<i;j++)
            {
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j]))
                    sum=sum+(map.get(arr[i]/arr[j])*map.get(arr[j]));
            }
            map.put(arr[i],sum);
            ans=ans+sum;
        }
        return (int)(ans%1000000007);
    }
}


class Solution{
    public int numFactoredBinaryTrees(int[] arr){
        int mod=1000000007;
        java.util.Arrays.sort(arr);
        HashMap<Integer,Long> map=new HashMap<>();
        for(int x:arr)map.put(x,1L);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    int r=arr[i]/arr[j];
                    if(map.containsKey(r)){
                        long v=(map.get(arr[j])*map.get(r))%mod;
                        map.put(arr[i],(map.get(arr[i])+v)%mod);
                    }
                }
            }
        }
        long ans=0;
        for(long v:map.values())
            ans=(ans+v)%mod;
        return (int)ans;
    }
}