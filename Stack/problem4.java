package Stack;

import java.util.Stack;
import java.util.ArrayList;

public class Problem4 {

    ArrayList<Integer> list;

    public Problem4() {
        list = new ArrayList<>();
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int a) {
        list.add(a);
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public int getMin() {
        if (isEmpty()) return -1;
         int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
         }
        return min;
    }

public int size() {
    return list.size();
}

public static void main(String[] args) {
    Problem4 stack = new Problem4();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


        Stack<Integer> stack2 = new Stack<>();
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        System.out.println(stack2.peek());
        System.out.println(stack2.size());
        System.out.println(stack2.pop());
        System.out.println(stack2.peek());
        System.out.println(stack2.isEmpty());
        stack2.pop();
        stack2.pop();
        System.out.println(stack2.isEmpty());
            System.out.println(stack2.size());
        }
    }
