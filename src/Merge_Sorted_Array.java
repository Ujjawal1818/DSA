import java.util.Arrays;
public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;

        int[] ans = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        for (int z = 0; z < m + n; z++) {
            nums1[z] = ans[z];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}