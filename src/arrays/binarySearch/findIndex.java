package arrays.binarySearch;

public class findIndex {
    public static void main(String[] args) {
        int[] array = { 2, 5 };
        int target = 0;

        System.out.println("\nIndex: " + indexFinder(array, target) + "\n");
    }

    static int indexFinder(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = (start + end) / 2, current = nums[mid];

        while (current != target && start != end) {

            if (target == current) {
                break;
            } else if (target < current) {
                end = mid - 1;
            } else if (target > current) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
            current = nums[mid];
        }

        int index = -1;
        if (nums[mid] == target) {
            index = mid;
        }

        return index;
    }
}
