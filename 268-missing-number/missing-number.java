class Solution {
    public int missingNumber(int[] nums) {
            int n1 = nums.length;
        int [] arr =new int [n1+1];
        int j = -1;
        for(int i : nums)
        {  
            arr[i]++;
            
        }

        for(int k=0 ;k<arr.length;k++)
        {if(arr[k]==0)
        j=k;
        }

        return j;
        
    }
}