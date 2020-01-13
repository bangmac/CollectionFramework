package CheckBracketByStack;

import java.util.Stack;

public class Tesst {

    public static void main(String[] args) {
        String checkBalancedExpr1=checkBalancedParentesis("s * (s – a) * (s – b) * (s – c)");
        System.out.println("s * (s – a) * (s – b) * (s – c) : "+checkBalancedExpr1);
        String checkBalancedExpr2=checkBalancedParentesis("((– b + (b2 – 4*a*c)^0.5) / 2*a");
        System.out.println("(– b + (b2 – 4*a*c)^0.5) / 2*a : "+checkBalancedExpr2);
        String checkBalancedExpr3=checkBalancedParentesis("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))");
        System.out.println("(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) : "+checkBalancedExpr3);

    }
    public static String checkBalancedParentesis(String expr)
    {
        if (expr.isEmpty())
            return "Balanced";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty()?"Balanced":"Not Balanced";
    }

}