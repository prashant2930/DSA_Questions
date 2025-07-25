package Arrays;


import java.util.Arrays;

public class mergesortedarrays {
    public static void main(String[] args) {
        // nums1 has extra space to hold nums2
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // last index of initial nums1
        int j = n - 1; // last index of nums2
        int k = m + n - 1; // last index of merged array (nums1)

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
