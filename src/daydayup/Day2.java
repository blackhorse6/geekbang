package daydayup;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * 1 删除排序数组中的重复项
 * 2 盛最多水的容器
 * ----      Description     ----
 * ----      Example         ----
 */
public class Day2 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = removeDuplicates(arr);
        System.out.println("新数组长度为:" + size);
        int[] arr2 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = maxArea(arr2);
        System.out.println("最大容水量是:" + max);
    }

    /**
     * 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (slow != i && nums[i] != nums[slow]) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }

    /**
     * 盛最多水的容器
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        if (height == null) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int max = Math.min(height[start], height[end]) * (end - start);
        while (start < end) {
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            int cur = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(cur, max);
        }
        return max;

    }

    /**
     * 移动零
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (j!=i){
                    nums[i]=0;
                }
                j++;
            }

        }

    }
}
