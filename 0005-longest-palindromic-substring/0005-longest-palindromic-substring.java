// class Solution {
//     private boolean solve(String s, int l, int r){
//             while(l<=r){
//                 if(s.charAt(l)!=s.charAt(r)){
//                     return false;
//                 }
//                 l++;
//                 r--;
//             }
//             return true;
//         }
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         int maxLen = Integer.MIN_VALUE;
//         int start = 0;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 if(solve(s,i,j)){
//                     if(j-i+1>maxLen){
//                         start = i;
//                         maxLen = j-i+1;
//                     }
//                 }
//             }
//         }
//         return s.substring(start, start+maxLen);
//     }
// }


class Solution {

    int n, start = 0, end = 0;

    public String longestPalindrome(String s) {
        n = s.length();
        getString(s.toCharArray(), 0);
        return s.substring(start, end + 1);
    }

    private void getString(char[] arr, int i) {
        if (i >= n)
            return;
        int left = i, right = i;
        while (right + 1 < n && arr[right + 1] == arr[i])
            right++;
        i = right + 1;
        while (right + 1 < n && left - 1 >= 0 && arr[right + 1] == arr[left - 1]) {
            right++;
            left--;
        }
        if (end - start < right - left) {
            start = left;
            end = right;
        }
        getString(arr, i);
    }
}