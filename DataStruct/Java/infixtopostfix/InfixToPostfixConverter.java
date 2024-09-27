
import java.util.*;
public class InfixToPostfixConverter {
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    public static String infixToPostfix(String infix, int stackSize) {
        oneStack stack = new oneStack(stackSize);
        char[] postfix = new char[infix.length()];
        int index = 0;

        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);

            if (Character.isLetterOrDigit(current)) 
            {
                // If the character is an operand, add it to the output.
                postfix[index++] = current;

            } 
            else if (current == '(') 
            {
                // If the character is '(', push it to the stack.
                stack.push(current);

            } 
            else if (current == ')') 
            {
                // If the character is ')', pop and output from the stack until '(' is found.
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix[index++] = stack.pop();
                }
                stack.pop();
            } 
            else if (isOperator(current)) 
            {
                // If the character is an operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(current)) {
                    postfix[index++] = stack.pop();
                }
                stack.push(current);
            }
        }

        // Pop all the operators from the stack.
        while (!stack.isEmpty())
        {
            postfix[index++] = stack.pop(); 
        }
        return new String(postfix, 0, index); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the stack size: ");
        int stackSize = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter the infix expression: ");
        String infixExpression = scanner.nextLine();

        try {
            String postfixExpression = infixToPostfix(infixExpression, stackSize);
            System.out.println("Infix Expression: " + infixExpression);
            System.out.println("Postfix Expression: " + postfixExpression);
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }
}