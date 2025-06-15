class CLL{
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }
    /* 
     *  public int delete(int index) {
        if (head == null) {
            return -1; // List is empty
        }
        if (index == 0) {
            // Special case: delete the head
            int val = head.value;
            if (head == tail) { // Only one element in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circular link
            }
            size--;
            return val;
        }

        // Deleting a node at a specific index other than 0
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;

        if (temp.next == head) { // If we delete the tail node, update the tail
            tail = temp;
        }

        size--;
        return val;
    }

     */
    public void delete(int value){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                return;
            }
            node = node.next;
        }while(node!=head);
    }
    
    public void display(){
        Node node = head;
       if(head!=null){
        do{
            System.out.print(node.value+" -> ");
            node = node.next;
        }while(node!=head);
    }
    System.out.println("HEAD");
}
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
}
public class CLL1{
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.delete(3);
        list.display();

    }
}