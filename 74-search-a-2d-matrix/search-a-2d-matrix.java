class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
  int startrow = 0;
  int startcol = matrix[0].length-1;

        while(startrow<matrix.length && startcol >= 0)
        {
            if(matrix[startrow][startcol]== target)
            return true;

            else if(matrix[startrow][startcol]< target)
            startrow++;
            else
            startcol--;
        }
        
   return false; }
}