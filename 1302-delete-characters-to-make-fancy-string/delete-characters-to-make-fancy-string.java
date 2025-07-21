class Solution {
    
    public String makeFancyString(String s) {
        
        StringBuilder fancyString = new StringBuilder();
      
        
        for (char currentChar : s.toCharArray()) {
            
            int currentLength = fancyString.length();
          
            
            if (currentLength > 1 && 
                fancyString.charAt(currentLength - 1) == currentChar && 
                fancyString.charAt(currentLength - 2) == currentChar) {
                
                continue;
            }
          
            
            fancyString.append(currentChar);
        }
      
       
        return fancyString.toString();
    }
}