import Java.util.Stack;

public class S400 {

    ArrayList<Integer> list;

    public S400 {
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
}
public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}