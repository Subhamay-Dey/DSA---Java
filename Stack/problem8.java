package Stack;

import java.util.Stack;

public class problem8 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public problem8() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        problem8 stack = new problem8();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println("Min: " + stack.getMin());   
        stack.pop();
        System.out.println("Min: " + stack.getMin());
        stack.pop();
        System.out.println("Min: " + stack.getMin());
        stack.pop();
        System.out.println("Min: " + stack.getMin());
        System.out.println("Top: " + stack.top());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
