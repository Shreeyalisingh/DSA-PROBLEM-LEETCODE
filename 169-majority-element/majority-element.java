class Solution {
    //Hashing
    public int majorityElement(int[] nums) {
 
 HashMap <Integer,Integer> mpp = new HashMap<>();
 int n=nums.length;
 for(int i=0;i<nums.length;i++)
 {
    int value = mpp.getOrDefault(nums[i],0);
    mpp.put(nums[i],value + 1);

 }

 for( Map.Entry<Integer,Integer>c:mpp.entrySet())
 {
    if(c.getValue()>n/2)
    return c.getKey();
 }
        
   return -1;     
    }
}