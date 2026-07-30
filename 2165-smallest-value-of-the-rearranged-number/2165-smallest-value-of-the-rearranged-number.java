class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;
        boolean negative = num<0;
        char[] digit = Long.toString(Math.abs(num)).toCharArray();
        Arrays.sort(digit);
        if(negative){
            reverse(digit);
            return -Long.parseLong(new String(digit));
        }
        if(digit[0]=='0'){  
            int i=0;
            while(digit[i]=='0') i++;
            char temp = digit[0];
            digit[0] = digit[i];
            digit[i] = temp;
        }
        return Long.parseLong(new String(digit));
    }
    private void reverse(char[] arr){
        int left=0, right = arr.length-1;
        while(left<right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        }
    }

}