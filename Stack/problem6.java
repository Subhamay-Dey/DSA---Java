package Stack;
import java.util.Stack;
class problem6 {

    Stack<Character> stack;

    public boolean isValid(String s) {
        stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


// [){)}][([)]