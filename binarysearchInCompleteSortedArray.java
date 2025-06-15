import java.util.Arrays;

public class binarysearchInCompleteSortedArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int target = 7;

        System.out.println(Arrays.toString(Fun(arr, target)));
    }

    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            } else if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] Fun(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) { // Until there are more than two rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows
        // Check whether the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (rStart + 1 < rows && arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // Search in the 4 halves
        // 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // 3rd half
        if (rStart + 1 < rows && target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        // 4th half
        if (rStart + 1 < rows && target >= arr[rStart + 1][cMid + 1]) {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[] { -1, -1 };
    }
}