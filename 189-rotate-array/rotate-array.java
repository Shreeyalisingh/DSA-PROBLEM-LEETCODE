class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> temp  = new ArrayList <>();
        int n = nums.length;
        int d = k%n;

        for(int j= n-d;j<n;j++)
        { 
            temp.add(nums[j]);
        }


        for(int i=n-d-1;i>=0;i--)
        {
            nums[i+d]=nums[i];
        }

        for(int i =0;i<d;i++)
        {
            nums[i]=temp.get(i);
        }
        
    }
}