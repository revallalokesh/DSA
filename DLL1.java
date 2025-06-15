class DLL {

    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertMiddle(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) { // Move temp to the node before the insertion point
            temp = temp.next;
        }
        Node node = new Node(value, temp.next, temp); // Create new node with next and prev pointers
        if (temp.next != null) {
            temp.next.prev = node; // Update next node's previous pointer
        }
        temp.next = node; // Link previous node to new node
        size++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int value) {
        Node p = find(after);

        if (p == null) {
            System.out.println("we can't insert here");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        size++;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayRev() {
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            node = node.next;
        }
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

public class DLL1 {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertMiddle(0, 4);
        list.display();
        list.displayRev();

    }
}