public class SplitArray {

    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 10, 8 };

        int m = 2;

        int ss = split(nums, m);
        System.out.println(ss);

    }

    public static int split(int[] nums, int m) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {

            // try this for potential answer

            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {

                if (sum + num > mid) {
                    // you cannot add this in this subarray,make new one
                    // say you add this num in new subarray,then sum = num;
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }

            }
            if (pieces > m) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }
        return end;
    }
}
