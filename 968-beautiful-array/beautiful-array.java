class Solution {
    public int[] beautifulArray(int n) {

        ArrayList<Integer> ans = new ArrayList <>();
        ans.add(1);
        while (ans.size()<n)
        {  ArrayList<Integer> temp = new ArrayList<>();
            for(int el:ans)
            {
                el = 2*el -1;
                if (el<= n)
                temp.add(el);
            }
            for(int el:ans)
            {
                el = 2*el;
                if (el<= n)
                temp.add(el);
            }
            ans = temp;
        }
        
        int [] arr = new int [n];
        for(int i =0;i<ans.size();i++)
        {
            arr[i]= ans.get(i);
        }

        return arr;
    }
}