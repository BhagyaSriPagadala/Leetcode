class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> rem_c=new HashMap<>();
        rem_c.put(0,1);
        int sum=0,count=0;
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0) rem+=k;
            if(rem_c.containsKey(rem)){
                count+=rem_c.get(rem);
            }
            rem_c.put(rem,rem_c.getOrDefault(rem,0)+1);
        }
        return count;
    }
}