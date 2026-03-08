package Stack;

import java.util.ArrayList;
import java.util.Stack;

class MyQueue {
    
    ArrayList<Integer> list;
    Stack<Integer> stack;
    public MyQueue() {
        list = new ArrayList<Integer>();
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        list.add(x);
        stack.push(x);
    }
    
    public int pop() {
        stack.pop();
        return list.remove(0);
    }
    
    public int peek() {
        return list.get(list.size() - 1);
    }
    
    public boolean empty() {
        return list.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */