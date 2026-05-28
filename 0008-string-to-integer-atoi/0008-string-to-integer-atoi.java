class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int i = 0;
        int sign = 1;
        long ans = 0;

        // sign
        if(s.charAt(0) == '-') {
            sign = -1;
            i++;
        } 
        else if(s.charAt(0) == '+') {
            i++;
        }
        // digits
        while(i < s.length()) {

            char c = s.charAt(i);
            if(!Character.isDigit(c)) break;
            ans = ans * 10 + (c - '0');
            // overflow check
            if(ans * sign >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(ans * sign <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(ans * sign);
    }
}