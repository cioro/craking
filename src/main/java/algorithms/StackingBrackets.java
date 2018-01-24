package algorithms;

import java.util.Stack;

public class StackingBrackets {

    public static boolean isBalanced(String expression) {

        //String must have an even number of characters
        if (expression.length() % 2 != 0) return false;
        char[] brackets = expression.toCharArray();
        Stack<Character> stack = new Stack<> ();
        for (char bracket: brackets)
        {
            switch (bracket)
            {
                case '{':
                    stack.push('}');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (bracket != stack.pop())
                        return false;
            }
        }
        return stack.isEmpty();
    };
}
