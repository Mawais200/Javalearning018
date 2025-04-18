class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    // Constructor
    public LinkedListStack() {
        this.top = null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // point new node to the old top
        top = newNode;       // move top to new node
        System.out.println(value + " pushed to stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedValue = top.data;
            top = top.next;  // move top pointer down
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            System.out.println("Top element is: " + top.data);
            return top.data;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedListStack myStack = new LinkedListStack();

        myStack.push(5);
        myStack.push(10);
        myStack.push(15);

        myStack.peek();

        myStack.pop();
        myStack.peek();
    }
}
