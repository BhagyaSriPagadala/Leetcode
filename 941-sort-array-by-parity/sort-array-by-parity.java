// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - 1; j++) {
//                 if (nums[j] % 2 != 0 && nums[j + 1] % 2 == 0) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }

//         return nums;
//     }
// }
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                // Swap if left is odd and right is even
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }

        return nums;
    }
}
