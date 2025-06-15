class CustomStack{
    protected int[] data;// protected means it can be accessed Within the same class.Within the same
                         // package (like default access). and By subclasses (even if they are in
                         // different packages).
    private static final int DEFAULT_SIZE = 10;// final cant' change by my self and private can't access by outers and
                                               // static without creating any object we can directly access with in the
                                               // stack class
    int ptr = -1;// if we add an element to stack it is increased and if we delete an element
                 // from stack it is decresed it is always pointing to last element of the stack;

    public CustomStack() {
        this(DEFAULT_SIZE);// it calls the default contructor with parameter size of class CustomStack
                           // means below constructor and assign defaut size to array;
    }

    public CustomStack(int size) {
        this.data = new int[size];// we can access instance variable and assign data to it
    }

    // adding an element to stack
    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    // removing element from the stack
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // (or) return data[ptr--];

    }

    // returns the head of the stack
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;// ptr at the last index;
    }

    public boolean isEmpty() {
        return ptr == -1;// if stack is empty;
    }
}
class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();//it will call the deafult CustomStack() constructor
    }
    public DynamicStack(int size){
        super(size);//it will call the deafult CustomStack(int size) constructor
        //Access parent class variables and methods using super
    }
    // here pop() peek() will remain same only thing to change the push() methode to add dynamic data

    public boolean push(int item){
        //this takes care of it being full 
        if(this.isFull()){
            //double the array size

            int[] temp = new int[data.length*2];
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
                }
                data = temp;

        }
        //at this point we know that array is not full;
        //insert item;
        return super.push(item);
    }
    public void display(){
        for(int i = 0; i <= ptr; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}

public class StackMain {
    public static void main(String[] args) throws Exception{
        DynamicStack stack  = new DynamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18); 
        stack.pop();
        stack.display();

    }

}
