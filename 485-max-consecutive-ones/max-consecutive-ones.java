class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i =0;
        int maxi =0;
        for(int j: nums)
        {
            if(j==1)
            i++;
            else 
            i=0;

           maxi= Math.max(maxi,i);
        }

        return maxi;
    }
}