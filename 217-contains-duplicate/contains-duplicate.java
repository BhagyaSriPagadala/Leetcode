class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<n;i++){
            if(res.containsKey(nums[i])){
                return true;
            }
            res.put(nums[i],i);
        }
        return false;


    }
}