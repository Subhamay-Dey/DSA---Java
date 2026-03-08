package Stack;

import java.util.Stack;


public class problem3 {

    public static String InputPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                continue;
            }
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            String dir = stack.get(i);
            result.append("/").append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();

    }

    public static void main(String[] args) {

        String input = "/home/../../tmp//./";
        String output = InputPath(input);

        System.out.println("Final Path: " + output);
    }
}