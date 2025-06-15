class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);// creating new node and put the value
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
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
        for (int i = 0; i < index - 1; i++) { // Start from 0 and go to index-1
            temp = temp.next;
        }
        Node node = new Node(value, temp.next); // Point new node to the current next node
        // Node node = new Node(value);
        // node.next = temp.next;
        temp.next = node; // Link the previous node to the new node
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
 
    public void insertRec(int value,int index){
       Node temp = null;
        temp = insertRec(value,index,head);
        // head = insertRec(value, index, head);
    }
    private Node insertRec(int value,int index,Node node){
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value,index-1,node.next);
        return node;
    }


    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteMiddle(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {// here we take loop from 0 that's why we check for i < size-2 or index-1
            node = node.next;
        }
        return node;
    }

    // finding the particular node a value

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

    public void display() {
        Node temp = head;// creating new node temp pointing to head
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
   
}

    
public class LL1 {

    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(10);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertMiddle(205, 2);

        

        System.out.println("first deleted number: " + list.deleteFirst());

        System.out.println("last deleted number: " + list.deleteLast());

        System.out.println("middle deleted number at index2: " + list.deleteMiddle(2));

        list.display();

        System.out.println(list.find(2));

        list.insertRec(5,1);
        list.display();
        
        // LL.Node node = list.find(2);
        // if (node != null) {
        // System.out.println("Found node with value: " + node.value);
        // } else {
        // System.out.println("Node with value 2 not found.");
        // }
        // try to convert all above public to private then it works

    }
}