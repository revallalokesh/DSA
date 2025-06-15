import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueArray{
    
    // Queue implementation using LinkedList
    private Queue<Integer> queue;
    
    // Stack implementation using Stack class
    private Stack<Integer> stack;

    // Array declaration
    private int[] arr;
    
    // Constructor
    public StackQueueArray(int size) {
        queue = new LinkedList<>();
        stack = new Stack<>();
        
        // Initialize array with given size
        arr = new int[size];
    }
    
    // Queue operations
    public void enqueue(int value) {
        queue.offer(value); // Adds element to the queue
    }
    
    public int dequeue() {
        return queue.poll(); // Removes and returns the front element
    }
    
    public int peekQueue() {
        return queue.peek(); // Returns the front element without removing
    }
    
    // Stack operations
    public void pushStack(int value) {
        stack.push(value); // Adds element to the stack
    }
    
    public int popStack() {
        return stack.pop(); // Removes and returns the top element
    }
    
    public int peekStack() {
        return stack.peek(); // Returns the top element without removing
    }
    
    // Array operations
    public void setArrayElement(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value; // Set element at specified index
        } else {
            System.out.println("Index out of bounds");
        }
    }
    
    public int getArrayElement(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index]; // Get element at specified index
        } else {
            System.out.println("Index out of bounds");
            return -1; // Return -1 if index is out of bounds
        }
    }
    
    public static void main(String[] args) {
        // Initialize with array size of 5
        StackQueueArray qsa = new StackQueueArray(5);
        
        // Queue example
        qsa.enqueue(10);
        qsa.enqueue(20);
        System.out.println("Queue peek: " + qsa.peekQueue()); // Output: 10
        System.out.println("Queue dequeue: " + qsa.dequeue()); // Output: 10
        
        // Stack example
        qsa.pushStack(30);
        qsa.pushStack(40);
        System.out.println("Stack peek: " + qsa.peekStack()); // Output: 40
        System.out.println("Stack pop: " + qsa.popStack()); // Output: 40
        
        // Array example
        qsa.setArrayElement(0, 100);
        qsa.setArrayElement(1, 200);
        System.out.println("Array element at index 0: " + qsa.getArrayElement(0)); // Output: 100
        System.out.println("Array element at index 1: " + qsa.getArrayElement(1)); // Output: 200
    }
}
