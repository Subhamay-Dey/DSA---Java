package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class problem81 {
    class Solution {

    Map<Character, String> phone = new HashMap<>(){{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    char[] arr;
    List<String> res = new LinkedList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return res;
        }
        this.arr = digits.toCharArray();
        Stack<Character> stack = new Stack<>();
        helper(stack, 0);
        return res;
    }

    private void helper(Stack<Character> stack, int index) {
        if(index == arr.length) {
            res.add(convertStackToString(stack));
            return;
        }
        
        String curString = phone.get(arr[index]);
        for(char cur: curString.toCharArray()) {
            stack.add(cur);
            helper(stack, index + 1);
            stack.pop();
        }
    }

    private String convertStackToString(Stack<Character> stack) {
        Iterator it = stack.iterator();
        StringBuilder str = new StringBuilder();
        while(it.hasNext()) {
            str.append(it.next());
        }
        return str.toString();
    }
}
}
