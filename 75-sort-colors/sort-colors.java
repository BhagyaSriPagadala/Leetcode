// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         int z=0,o=0,t=0;
//         for(int i=0;i<n;i++)
//         {
//             if(nums[i]==0)
//             {
//                 z++;
//             }
//             else if(nums[i]==1)
//             {
//                 o++;
//             }
//             else
//             {
//                 t++;
//             }

//         }
//         int ind=0;
//         for(int i=0;i<z;i++)
//         {
//             nums[ind++]=0;
//         }
//         for(int i=0;i<o;i++)
//         {
//             nums[ind++]=1;
//         }
//         for(int i=0;i<t;i++)
//         {
//             nums[ind++]=2;
//         }
//         for(int i=0;i<ind;i++)
//         {
//             System.out.println(nums);
//         }
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}