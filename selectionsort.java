import java.util.Arrays;

class selectionsort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] arr) {

        for(int i=0;i<arr.length;i++){

            int last = arr.length-i-1;

            int maxIndex  = getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }

    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int maxIndex = start;
        for(int i=start+1;i<=end;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
