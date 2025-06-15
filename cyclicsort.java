
    import java.util.Arrays;
    public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CyclicSort(int[] arr) {

        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr, i, correct);
                System.out.println(i);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}