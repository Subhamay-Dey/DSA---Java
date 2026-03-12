package Stack;

import java.util.Stack;

public class problem10 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack3 = new Stack<Integer>();

    int limit = 0;

    public problem10(int maxSize) {
        limit = maxSize;
    }
    
    public void push(int x) {
        if(stack1.size() < limit) {
            stack1.push(x);
        }
    }
    
    public int pop() {
         if(stack1.isEmpty()) {
            return -1;
        }
        return stack1.pop();
    }
    
    public void increment(int k, int val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        if(stack2.size() < k) {
            while(!stack2.isEmpty()) {
                    stack3.push(stack2.peek() + val);
                    stack2.pop();
                }
        } else {
            for(int i = 1; i <= k; i++) {
                    stack3.push(stack2.peek() + val);
                    stack2.pop();
            }
        }
        while(!stack3.isEmpty()) {
            stack2.push(stack3.peek());
            stack3.pop();
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    public static void main(String[] args) {
        problem10 t = new problem10(6);
        t.push(5);
        t.push(2);
        t.push(1);
        t.push(7);
        t.push(9);
        System.out.println(t.stack1);
        t.increment(10, 200);
        System.out.println(t.stack1);

    }
        
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
