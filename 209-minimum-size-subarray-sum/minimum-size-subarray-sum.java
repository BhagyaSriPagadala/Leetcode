class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minwin=Integer.MAX_VALUE;
        int curr=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            curr+=nums[high];
            high++;
            while(curr>=target){
                int currsize=high-low;
                minwin=Math.min(minwin,currsize);
                curr-=nums[low];
                low++;
            }
        }
        return minwin==Integer.MAX_VALUE?0:minwin;
    }
}