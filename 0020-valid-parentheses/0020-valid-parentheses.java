// class Solution {
//     public boolean isValid(String s) {
//         while(s.contains("()") ||
//         s.contains("{}")||
//         s.contains("[]")){
//             s = s.replace("()", "");
//             s = s.replace("{}", "");
//             s = s.replace("[]", "");

//         }
//         return s.length()==0;
//     }
// }


class Solution{
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() !=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}