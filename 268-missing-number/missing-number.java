class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int total=0;
        int n = nums.length;
            total=n*(n+1)/2;
        
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        return total-sum;
        
        // int result = n;
        // for (int i = 0; i < n; i++) {    
        //     result ^= i ^ nums[i];
        // }
        // return result;
    }
}
        
