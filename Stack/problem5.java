import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> list;
    public MinStack() {
        list = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        if(!isEmpty()) {
            list.remove(list.size() - 1);
        }
        return;
    }
    
    public int top() {
        if(!isEmpty()) {
            return list.get(list.size() - 1);
        }
        return -1;
    }
    
    public int getMin() {
        int min = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
}

// public static void main(String[] args) {
//     MinStack stack = new MinStack();
//     stack.push(-2);
//     stack.push(0);
//     stack.push(-3);
//     stack.getMin();
//     stack.pop();
//     stack.top();
//     stack.getMin();
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */