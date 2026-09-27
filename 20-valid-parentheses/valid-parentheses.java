class Solution {
    public boolean isValid(String s) {

        // Create a stack to store opening brackets
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Check for opening brackets and push them
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Check for closing brackets
            else {

                // No opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                // Remove the top opening bracket
                char top = stack.pop();

                // Check whether brackets match
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // All opening brackets must have been matched
        return stack.isEmpty();
    }
}