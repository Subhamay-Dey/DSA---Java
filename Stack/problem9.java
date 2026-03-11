package Stack;

import java.util.Stack;

public class problem9 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public problem9() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        return stack2.pop();
    }
    
    public int peek() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        if(!stack1.isEmpty()) {
            return false;
        } if(!stack2.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        problem9 a = new problem9();
        a.push(1);
        a.push(4);
        a.push(9);
        a.push(2);
        System.out.println(a.pop());
        a.push(0);
    }
}
