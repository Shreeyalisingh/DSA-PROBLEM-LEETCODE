class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        Map<Integer,Integer> lonelymap = new HashMap<Integer,Integer>();
        ArrayList <Integer> result = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(lonelymap.containsKey(nums[i]))
            {
               lonelymap.put(nums[i],lonelymap.get(nums[i])+1) ;
            }

            else 
            lonelymap.put(nums[i],1);
        }

        for(Map.Entry<Integer,Integer> entry : lonelymap.entrySet())
        {
           if( entry.getValue() == 1)
           {
                if(!lonelymap.containsKey(entry.getKey()+1)&&!lonelymap.containsKey(entry.getKey()-1))
                    result.add(entry.getKey());

           }
        }
        return result;
    }
}