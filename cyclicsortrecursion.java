
import java.util.Arrays;

public class cyclicsortrecursion{

    public static void main(String[] args) {

        int[] arr = {2,1,4,3,5};
        fun(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                fun(arr,r,c+1,c);
            }
            else{
                fun(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            fun(arr,r-1,0,0);
        }
        
    }
}
