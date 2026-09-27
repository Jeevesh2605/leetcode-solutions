class Solution {
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