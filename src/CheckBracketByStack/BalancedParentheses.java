package CheckBracketByStack;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isParenthesisMatch(String str) {
        if (str.charAt(0) == '{')
            return false;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(isParenthesisMatch(str));
    }
}