class Solution {
    //Hashmap
    public int majorityElement(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int ans = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {   if(hm.containsKey(i))
            hm.put(i,hm.get(i)+1);
            else 
            hm.put(i,1);
        }

        Set<Integer> entry = hm.keySet();
        for(int i : entry){
            if(hm.get(i)>maxi && hm.get(i)>n/2)
            {
            maxi = hm.get(i);
            ans = i;
            }
        }
            
        return ans;
       
    }

}