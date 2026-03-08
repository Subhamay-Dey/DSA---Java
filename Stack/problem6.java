class Solution {

    Stack<Character> stack;

    public boolean isValid(String s) {
        stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                if(s.charAt(i=1) == ')' || s.charAt(i=1) == '}' || s.charAt(i=1) == ']')
        }
    }
}
}


// [){)}][([)]