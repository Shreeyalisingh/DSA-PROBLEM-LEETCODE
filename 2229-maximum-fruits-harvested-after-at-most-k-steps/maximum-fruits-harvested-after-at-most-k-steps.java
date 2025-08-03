class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int maxFruits = 0; 
        int currentSum = 0;
      
       
        for (int i = 0, j = 0; j < fruits.length; ++j) {
            int positionJ = fruits[j][0]; 
            int fruitsAtJ = fruits[j][1]; 
            currentSum += fruitsAtJ; 

            
            while (i <= j &&
                   positionJ - fruits[i][0] +
                   Math.min(Math.abs(startPos - fruits[i][0]), Math.abs(startPos - positionJ))
                   > k) {
                
                currentSum -= fruits[i][1];
                i++; 
            }
          
            
            maxFruits = Math.max(maxFruits, currentSum);
        }
        return maxFruits; 
    }
}
