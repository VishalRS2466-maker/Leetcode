class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        String open = "([{";
        
        for (int i = 0; i < s.length(); i++) {
            if (open.indexOf(s.charAt(i)) != -1) {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()) {
                    return false;
                }
                if ((stack.peek() == '(' && s.charAt(i) == ')') ||
                (stack.peek() == '[' && s.charAt(i) == ']') ||
                (stack.peek() == '{' && s.charAt(i) == '}')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}