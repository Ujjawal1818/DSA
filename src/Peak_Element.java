class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Solution obj = new Solution();
        System.out.println(obj.findPeakElement(nums));
    }
}