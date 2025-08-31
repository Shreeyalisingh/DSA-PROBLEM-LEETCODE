class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> set = new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : arr)
        { if(set.containsKey(i))
            set.put(i, set.get(i)+1);

            else
        set.put(i,1);
        }

        Set<Integer> entry = set.keySet();
        for(int i : entry)
        {
            set1.add(set.get(i));
        }
        
        if(set.size()==set1.size())
        return true;

        else return false;
    }
}