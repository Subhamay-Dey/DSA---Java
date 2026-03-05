import Java.util.Stack;

public class S400 {

    ArrayList<Integer> list;

    public S400() {
        list = new ArrayList<>();
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() === 0;
    }

    public int push(int a) {
        list.add(a);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return list.remove(list.size() - 1);
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
}
public class main {
    public static void main(String[] args) {
        S400 stack = new S400();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
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
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.size());
    }
}