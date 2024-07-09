package afternoon.collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input = "이효석";

        char[] charArr = input.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }

        char[] reverseArr = new char[charArr.length];
        int i = 0;
        while (!stack.isEmpty()) {
            reverseArr[i++] = stack.pop();
        }

        String reversed = new String(reverseArr);

        System.out.println("input = " + input);
        System.out.println("reversed = " + reversed);
    }

}
