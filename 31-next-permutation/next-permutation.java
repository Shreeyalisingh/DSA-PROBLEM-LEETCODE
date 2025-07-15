class Solution {
    public void nextPermutation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

       
        for (int num : nums) {
            list.add(num);
        }

        int index = -1;

      
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            Collections.reverse(list);
            for (int i = 0; i < nums.length; i++) {
                nums[i] = list.get(i);
            }
            return;
        }

       
        for (int i = list.size() - 1; i > index; i--) {
            if (list.get(i) > list.get(index)) {
                int temp = list.get(i);
                list.set(i, list.get(index));
                list.set(index, temp);
                break;
            }
        }

        
        List<Integer> newlist = list.subList(index + 1, list.size());
        Collections.sort(newlist);

        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
