import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackqueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack); // Output: [10, 20, 30]

        System.out.println("Stack after pushes: " + stack); // Output: [10, 20, 30]

        System.out.println("Stack peek: " + stack.peek()); // Output: 30
        System.out.println("Stack pop: " + stack.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        System.out.println("Stack search for 10: " + stack.search(10)); // Output: 2

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(5);

        queue.offer(30);
        System.out.println("Queue after adds: " + queue); // Output: [10, 20, 30]

        System.out.println("Queue peek: " + queue.peek()); // Output: 10
        System.out.println("Queue poll: " + queue.poll()); // Output: 10
        System.out.println("Queue after poll: " + queue); // Output: [20, 30]

        System.out.println("Queue remove: " + queue.remove()); // Output: 20
        System.out.println("Queue after remove: " + queue); // Output: [30]
        System.out.println(queue.element());

        System.out.println(stack.get(0));
        System.out.println(queue.size());
    }
}
