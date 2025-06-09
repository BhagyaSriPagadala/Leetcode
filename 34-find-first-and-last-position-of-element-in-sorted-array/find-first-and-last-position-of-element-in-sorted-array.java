class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
         res[0]=fposition(nums,target);
         res[1]=lposition(nums,target);
        return res;
    }
        public int fposition(int[] nums,int target)
        {
            int n=nums.length;
            int l=0;
            int h=n-1;
            int pos=-1;
            while(l<=h)
            {
                int m=l+(h-l)/2;
                
                if(nums[m]==target )
                {
                    
                    pos=m;
                    h=m-1;
                }
                else if(nums[m]<target)
                {
                    l=m+1;
                }
                else
                {
                    h=m-1;
                }
            }
            return pos;
        }
        public int lposition(int[] nums,int target)
        {
            int n=nums.length;
            int l=0;
            int h=n-1;
            int pos=-1;
            while(l<=h)
            {
                int m=l+(h-l)/2;
                if(nums[m]==target)
                {
                   
                    pos=m;
                    l=m+1;
                }
                else if(nums[m]<target)
                {
                    l=m+1;
                }
                else
                {
                    h=m-1;
                }
            }
            return pos;
        }
}
