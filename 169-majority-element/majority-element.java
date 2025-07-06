class Solution {
    //brute force
    public int majorityElement(int[] nums) {
int n = nums.length;
int majority= nums.length/2;
int count =0;
int max =0;

        for(int i =0 ;i<n;i++)
        { count =0;
            for(int j =0 ;j<n;j++)
            {
                if( nums[i]==nums[j] )
                count++;
            }
if(count>majority)
return nums[i];

        }
        return 0;
        
        
    }
}