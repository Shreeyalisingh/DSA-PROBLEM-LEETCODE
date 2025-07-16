class Solution {
    public int longestConsecutive(int[] nums) {

       Arrays.sort(nums);
       int count =1;
       int max_count=0;
       if(nums.length<=1)
       {
        if(nums.length==0)
        return 0;
        else
        return 1;
       }

       for(int i=0;i<nums.length-1;i++)
       {
       if( nums[i]+1 == nums[i+1])
       {
            count++;
       }
       else if( nums[i] == nums[i+1])
       count = count;

       else 
       count =1;

       max_count = Math.max(count,max_count);
       }
return max_count;
    }
}