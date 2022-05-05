class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
                i++;
            }
            else if(s.charAt(i) == ']'){
                if(stack.size() >0 && stack.peek() == '['){
                    stack.pop();
                    i++;
                }else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(stack.size() >0 && stack.peek() == '{'){
                    stack.pop();
                    i++;
                }else{
                    return false;
                }
            }
            else if(s.charAt(i) == ')'){
                if(stack.size() >0 && stack.peek() == '('){
                    stack.pop();
                    i++;
                }else{
                    return false;
                }
            }
        }
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }
}