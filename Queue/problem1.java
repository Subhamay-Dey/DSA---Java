package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class problem1 {
    Deque<Integer> queue1;
    Deque<Integer> queue2;
    public problem1(){
        queue1 = new ArrayDeque<Integer>();
        queue2 = new ArrayDeque<Integer>();
    }

    public void push(int val){
        queue1.add(val);
        queue2.addFirst(queue1.getLast());
    }

    public int pop() {
        return queue2.remove();
    }

    public int peek() {
        return queue2.peek();
    }

    public boolean empty() {
        if(queue2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        problem1 Q = new problem1();
        Q.push(1);
        Q.push(0);
        Q.push(7);
        Q.push(5);
        System.out.println(Q.queue1);
        System.out.println(Q.queue2);
        System.out.println(Q.peek());
        System.out.println(Q.pop());
        System.out.println(Q.peek());
        System.out.println(Q.queue2);
        System.out.println(Q.empty());
    }
}
