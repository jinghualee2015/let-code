/**
 * Copyright (C), 2022 ~ 2024, NyquistAi.inc
 *
 * @author: Nyquist Data Tech Team
 * @version:
 * @date: 2024/5/20
 * @description:
 */
public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged_array = new int[nums1.length + nums2.length];
        int l = 0, r = 0, i = 0;
        while (l < nums1.length && r < nums2.length) {
            merged_array[i++] = nums1[l] <= nums2[r] ? nums1[l++] : nums2[r++];
        }
        while (l < nums1.length) {
            merged_array[i++] = nums1[l++];
        }
        while (r < nums2.length) {
            merged_array[i++] = nums2[r++];
        }

        double ans = 0;
        int last = i - 1;
        if (last % 2 == 0) {
            ans = merged_array[last / 2];
        } else {
            ans = (double) (merged_array[last / 2] + merged_array[last / 2 + 1]) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] num2 = new int[]{1, 1, 2, 3, 4, 5, 6};

        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
