package Stack;

import java.util.Arrays;
import java.util.Stack;

public class problem2 {

    public static int[] findNextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove elements that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element on the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push this element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println("Next Greater Elements: " + Arrays.toString(findNextGreaterElements(arr)));
    }
}
