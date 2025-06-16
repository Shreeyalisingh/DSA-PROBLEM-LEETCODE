class Solution {
    public void moveZeroes(int[] nums) {
if(nums.length==1)
{
    return;
}
List <Integer> nonZero = new ArrayList<>();
for(int i =0;i<nums.length;i++)
{ if(nums[i]!=0)
    nonZero.add(nums[i]);
}
for(int i=0;i<nonZero.size();i++)
{
    nums[i]= nonZero.get(i);
}
for(int i =nonZero.size();i<nums.length;i++)
{
    nums[i]=0;
}

    }}