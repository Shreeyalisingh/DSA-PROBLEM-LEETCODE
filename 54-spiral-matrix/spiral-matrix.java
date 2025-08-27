class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int rowend = matrix.length-1;
        int colend=matrix[0].length-1;

        int rowstart=0;
        int colstart =0;

        while(rowstart<=rowend && colstart<= colend)
        { //top
            for(int i = colstart;i<=colend;i++){
                result.add(matrix[rowstart][i]);
            }
            //left
            for(int j =rowstart+1;j<=rowend;j++){
                result.add(matrix[j][colend]);
            }

             //bottom
            for(int i =colend-1;i>=colstart;i--){
                if(rowstart==rowend){
                    break;
                }
                result.add(matrix[rowend][i]);
            }
            //left
            for(int i =rowend-1;i>rowstart;i--){
                if(colstart==colend){
                    break;
                }
                result.add(matrix[i][colstart]);
            }

            rowstart++;rowend--;colstart++;colend--;
        }
        
  return  result ;}
}