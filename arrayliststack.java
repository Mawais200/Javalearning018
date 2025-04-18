public class ArrayListStack {
    private int[] stackArray;
    private int size;
    private int capacity;

    // Constructor
    public ArrayListStack(int initialCapacity) {
        capacity = initialCapacity;
        stackArray = new int[capacity];
        size = 0; // size of stack (number of elements)
    }

    // Resize method to mimic ArrayList's dynamic behavior
    private void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }

    // Push operation
    public void push(int value) {
        if (size == capacity) {
            resize(); // expand array if needed
        }
        stackArray[size++] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int popped = stackArray[--size];
        System.out.println(popped + " popped from stack");
        return popped;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        System.out.println("Top element is: " + stackArray[size - 1]);
        return stackArray[size - 1];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayListStack myStack = new ArrayListStack(3); // Initial capacity = 3

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        myStack.push(400); // Triggers resize

        myStack.peek();
        myStack.pop();
        myStack.peek();
    }
}
