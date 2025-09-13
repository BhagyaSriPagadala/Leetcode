// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int c=0;
//         for(int i=0;i<nums.length;i++)
//         {
//            if(nums[i]!=nums[c])
//            {
//             c++;
//             nums[c]=nums[i];
//            }
//         }
//         return c+1;
//     }
   
// }









class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        //int res[] = new int[s.size()];
        int i=0;
        for(int num : s)
        {
            nums[i++]=num;
        }
        return s.size();
    }
}