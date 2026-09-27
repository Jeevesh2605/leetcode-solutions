class Solution1 {
    public String reverseParentheses(String s) {
        Stack <Integer> stack = new Stack<>();
        StringBuilder result= new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack.push(result.length());
            }else if(ch==')'){
                int l = stack.pop();
                int i=l;
                int j=result.length()-1;
                while(i<j){
                    char temp = result.charAt(i);
                    result.setCharAt(i,result.charAt(j));
                    result.setCharAt(j,temp);
                    i++;
                    j--;
                }
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}

class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> openBracket = new Stack<>();
        int[] door = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                openBracket.push(i);
            } else if (s.charAt(i) == ')') {
                int j = openBracket.pop();
                door[i] = j;
                door[j] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        int direction = 1; 
        for (int i = 0; i < n; i += direction) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = door[i];
                direction = -direction;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}