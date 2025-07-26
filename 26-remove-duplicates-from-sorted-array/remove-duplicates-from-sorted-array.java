class Solution {
    public int removeDuplicates(int[] arr) {

       TreeSet<Integer> set = new TreeSet<>();

       for(int i=0;i<arr.length;i++){
           set.add(arr[i]);

       }
    int k = set.size();
    int j=0;
    for(int i : set)
    {
        arr[j++]=i;
    }

    return k;
        
    }
}