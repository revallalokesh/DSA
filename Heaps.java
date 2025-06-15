import java.util.ArrayList;

public class Heaps<T extends Comparable<T>> {

    private ArrayList<T> list;

    public Heaps() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return (index * 2) + 1;
    }

    private int right(int index) {
        return (index * 2) + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
        // if (list.get(index) < list.get(p)) {
        //     swap(index, p);
        //     upheap(p);
        // }
    }

    public T remove() throws Exception {
        if (list.size() == 0) {
            throw new Exception("Heap is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        // if (left < list.size() && list.get(left) < list.get(min)) {
        //     min = left;
        // }
        // if (right < list.size() && list.get(right) < list.get(min)) {
        //     min = right;
        // }

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != index) {
            swap(index, min);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    // Main method to test the heap functionality
    public static void main(String[] args) {
            Heaps<Integer> heap = new Heaps<>();

            // Insert elements into the heap
            heap.insert(10);
            heap.insert(3);
            heap.insert(15);
            heap.insert(5);
            heap.insert(1);

            // Perform heap sort
            ArrayList<Integer> sorted = heap.heapSort();

            // Display the sorted output
            System.out.println("Heap sorted values: " + sorted);

            // Create another heap for String values
            Heaps<String> stringHeap = new Heaps<>();

            // Insert elements into the heap
            stringHeap.insert("banana");
            stringHeap.insert("apple");
            stringHeap.insert("cherry");
            stringHeap.insert("date");

            // Perform heap sort
            ArrayList<String> sortedStrings = stringHeap.heapSort();

            // Display the sorted output
            System.out.println("Heap sorted string values: " + sortedStrings);

    }
}

// class MinHeap {
//     private int[] heap;
//     private int size;
//     private int maxSize;

//     public MinHeap(int maxSize) {
//         this.maxSize = maxSize;
//         this.size = 0;
//         heap = new int[maxSize];
//     }

//     // Returns the index of the parent
//     private int parent(int i) { return (i - 1) / 2; }

//     // Returns the index of the left child
//     private int left(int i) { return (2 * i) + 1; }

//     // Returns the index of the right child
//     private int right(int i) { return (2 * i) + 2; }

//     // Swaps two elements
//     private void swap(int i, int j) {
//         int temp = heap[i];
//         heap[i] = heap[j];
//         heap[j] = temp;
//     }

//     // Inserts a new value into the heap
//     public void insert(int val) {
//         if (size >= maxSize) {
//             System.out.println("Heap is full!");
//             return;
//         }

//         heap[size] = val;
//         int current = size;
//         size++;

//         // Fix the min-heap property if violated
//         while (current > 0 && heap[current] < heap[parent(current)]) {
//             swap(current, parent(current));
//             current = parent(current);
//         }
//     }

//     // Heapify to maintain the min-heap property
//     private void heapify(int i) {
//         int left = left(i);
//         int right = right(i);
//         int smallest = i;

//         if (left < size && heap[left] < heap[smallest]) {
//             smallest = left;
//         }

//         if (right < size && heap[right] < heap[smallest]) {
//             smallest = right;
//         }

//         if (smallest != i) {
//             swap(i, smallest);
//             heapify(smallest);
//         }
//     }

//     // Removes and returns the smallest element
//     public int extractMin() {
//         if (size <= 0) {
//             System.out.println("Heap is empty!");
//             return Integer.MAX_VALUE;
//         }

//         int root = heap[0];
//         heap[0] = heap[size - 1];
//         size--;
//         heapify(0);
//         return root;
//     }

//     // Prints the heap
//     public void printHeap() {
//         for (int i = 0; i < size; i++) {
//             System.out.print(heap[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         MinHeap minHeap = new MinHeap(10);

//         minHeap.insert(5);
//         minHeap.insert(3);
//         minHeap.insert(17);
//         minHeap.insert(10);
//         minHeap.insert(84);
//         minHeap.insert(19);
//         minHeap.insert(6);
//         minHeap.insert(22);
//         minHeap.insert(9);

//         System.out.println("Min-Heap:");
//         minHeap.printHeap();

//         System.out.println("Extracted Min: " + minHeap.extractMin());
//         System.out.println("Heap after extraction:");
//         minHeap.printHeap();
//     }
// }
//the above implementation using arrays 

