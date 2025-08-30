class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 2)
        return true;
        else{
        int l = 0;
        int r = nums.length-1;

        if(nums[l]<=nums[r])
        {
            //check ascending 

            for(int i =0 ;i<nums.length-1;i++)
            {
                if(nums[i]>nums[i+1])
                return false;
            }
        }

        else if (nums[l]>nums[r])
        {
             for(int i =0 ;i<nums.length-1;i++)
            {
                if(nums[i]<nums[i+1])
                return false;
            }
        }
        
        else
        return true;

        }

        return true;
        
    }
}