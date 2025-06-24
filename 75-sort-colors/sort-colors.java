class Solution {
    public void sortColors(int[] nums) {
       ArrayList<Integer>red = new ArrayList <>();
         ArrayList<Integer>white= new ArrayList <>();
           ArrayList<Integer>blue= new ArrayList <>();
for(int i=0;i<nums.length;i++)
{
           if(nums[i]==0)
           red.add(nums[i]);
           if(nums[i]==1)
           white.add(nums[i]);
           if(nums[i]==2)
           blue.add(nums[i]);
}
    int sred = red.size();
     int swhite = white.size();
      int sblue = blue.size();

      for(int i=0;i<sred;i++)
      {
        nums[i]=red.get(i);
      }
      for(int i=sred;i<swhite+sred;i++)
      {
        nums[i]=white.get(i-sred);
      }
      for(int i=swhite+sred;i<swhite+sred+sblue;i++)
      {
        nums[i]=blue.get(i-(swhite+sred));
      }

        
       
        
    }
}