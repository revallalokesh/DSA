import java.util.Arrays;

public class selectionsortsmall {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int start = i;

            int last = arr.length - 1;
            int smallIndex = getSmallIndex(arr, start, last);

            swap(arr, smallIndex, i);
        }

    }

    public static int getSmallIndex(int[] arr, int start, int end) {
        int small = end;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[small]) {
                small = i;
            }
        }
        return small;
    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
