/**
 * searchinrotatedarray
 */
public class searchinrotatedarray {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int ss = Search(nums,target);
        System.out.println(ss);


    }

    public static int Search ( int[] nums, int target){

        if (nums == null || nums.length == 0) return -1;

        int pivot = Peak(nums);

        if (pivot == -1) {
            return Bs(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return Bs(nums, target, 0, pivot - 1);
        }

        return Bs(nums, target, pivot + 1, nums.length - 1);
    }

    public static int Peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int Bs(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}