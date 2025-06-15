import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

        int[] arr = {6,1,7,9,3};

        //if you want to update original array then  arr = fun(arr);

        int[] ans  = fun(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] fun(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = fun(Arrays.copyOfRange(arr,0,mid));
        int[] right = fun(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    
    public static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){

            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }else{
                result[k] = right[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining element
        //example left array [3,5,7,9,12,22];
        //right array [6,4,8,10];
        while(i<left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
