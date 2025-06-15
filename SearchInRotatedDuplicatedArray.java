public class SearchInRotatedDuplicatedArray{
    
    public static void main(String[] args) {

        int[] nums = {4, 4, 5, 6, 7, 0, 1, 2, 4, 4, 4, 4};

        int target = 5;

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
            //if elements at start,end ,middle are equal then  just skip the duplicate elements
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                //Note what if start and end are pivot;
                //check this is pivot or not
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid]||nums[mid]==nums[start]&&nums[end]<nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
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