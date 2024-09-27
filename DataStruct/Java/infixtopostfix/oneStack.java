
package infixtopostfix;
public class oneStack 
{
    private char[] stack;
    private int top;
    private int capacity;

    public oneStack(int capacity) 
    {
        this.capacity = capacity;
        stack = new char[capacity];
        top = -1;
    }
   
    public void push(char value) 
    {
        if (top + 1 == capacity) {
            throw new RuntimeException("Stack full: Cannot push " + value);
        }
        stack[++top] = value;
    }
   
    public char pop() 
    {
        if (isEmpty()) 
        {
            throw new RuntimeException("Stack underflow: Cannot pop from an empty stack.");
        }
        return stack[top--];
    }

    public char peek() 
    {
        if (isEmpty()) 
        {
            throw new RuntimeException("Stack is empty, cannot peek.");
        }
        return stack[top];
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }
}

