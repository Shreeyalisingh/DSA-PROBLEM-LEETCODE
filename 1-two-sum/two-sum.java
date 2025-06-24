class Solution {
    public int[] twoSum(int[] nums, int target) {

HashMap<Integer,Integer> map=new HashMap<>();
int n =nums.length;

for(int i =0;i<n;i++)
{
    map.put(nums[i],i);

}

for(int j =0;j<n;j++)
{  
  int rem = target - nums[j];
  if(map.containsKey(rem))
  {

    if(map.get(rem)!=j)

{        
    int x= map.get(rem);
    return new int [] {j,x};
}
  }
}



   return new int[0]; }
}