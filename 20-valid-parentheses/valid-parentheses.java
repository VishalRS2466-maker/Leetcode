class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            //checking for opening brackets and pushing them
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            //checking end brackets or closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' ||
                    ch == ']' && top != '[' ||
                    ch == '}' && top != '{') {
                    return false;
                }
               
            }
        }
        return stack.isEmpty();
    }
}