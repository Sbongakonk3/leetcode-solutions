class Solution {
    public boolean isValid(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                } 
                char top = stack.pop();

                if ((c == ')' && top != '(') ||  (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
