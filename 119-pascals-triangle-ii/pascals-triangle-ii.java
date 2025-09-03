class Solution {
   
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }
        for (int currentRow = 2; currentRow <= rowIndex; currentRow++) {
            for (int position = currentRow - 1; position > 0; position--) {
                row.set(position, row.get(position) + row.get(position - 1));
            }
        }
      
        return row;
    }
}