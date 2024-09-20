import java.util.*;

public class sampleStack<T> extends Stack<T> {
    private int maxSize;

    public sampleStack(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public T push(T item) {
        if (this.size() >= maxSize) {
            System.out.println("Cannot push " + item + ". Stack has reached its max size of " + maxSize);
            return null;
        }
        return super.push(item);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public static void main(String[] args) {
        boolean toLoop = true;
    
        while (toLoop){
        int stackSize, stackInput;
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Enter size of stack in integer: ");
        stackSize = scan.nextInt();

        sampleStack<Integer> stack = new sampleStack<>(stackSize);

        for (int i = 0; i < stackSize; i++){
            System.out.println("Enter a number to push into the stack: ");
            stackInput = scan.nextInt();
            stack.push(stackInput);
        }
        toLoop = false;
        System.out.println("Stack after pushing "+ stackSize + " elements: " + stack);
        }
    }
}