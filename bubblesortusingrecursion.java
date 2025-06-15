import java.util.Arrays;
public class bubblesortusingrecursion {
    public static void main(String[] args) {
        int[] kk = {4,2,1,3};
        fun(kk,kk.length-1,0);
        System.out.println(Arrays.toString(kk));
        
    }
    public static void fun(int[] arr,int r ,int c){

        if(r == 0){
            return;
        }
        if(c < r){ 
           if(arr[c] > arr[c+1]){
           int temp = arr[c];
           arr[c] = arr[c+1];
           arr[c+1] = temp;
           }
           fun(arr,r,c+1);
        }
        else{
        fun(arr,r-1,0);
        }
    }
}
