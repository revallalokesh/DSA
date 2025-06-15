class CircularQueue{
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;//pointer name is end because it is pointing ti the end int the queue  always
    protected int front = 0;
    private int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    } 
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++; 
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
            }
            return data[front];
    }

    // public void display(){
    //     if(isEmpty()){
    //         System.out.println("Queue is empty");
    //         return;
    //     }
    //     int i = front;
    //     do{
    //         System.out.print(data[i] +"->");
    //         i++;
    //         i = i % data.length;
    //     }while(i!=end);
    //     System.out.println("FRONT");
    // }
}
class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    public boolean insert(int item){
        
        if(this.isFull()){

            int[] temp = new int[data.length*2];
            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front+i) % data.length];
            }
            front= 0;
            end = data.length;
            data = temp;

        }
        return super.insert(item);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] +"->");
            i++;
            i = i% data.length;
        }while(i!=end);
        System.out.println("FRONT");
    }
}
public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);queue.insert(25);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.insert(20);
        queue.insert(21);
        queue.insert(22);
        queue.insert(23);
        queue.insert(24);
        queue.display();
    }
}
