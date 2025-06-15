import java.util.Arrays;

public class quicksort {
        public static void main(String[] args) {

        int[] arr = {1,7,3,2,4,8,6};

        fun(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void fun(int[] arr, int low, int high) {

        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid  = s + (e-s)/2;
        int pivot = arr[mid];
        
        while(s<=e){
            //it is also sorted 
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        fun(arr,low,e);
        fun(arr,s,high);
    }
}