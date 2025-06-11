class Solution {
    public boolean isPalindrome(String s) {

   s=s.toLowerCase().replaceAll("[^a-z0-9]","");
   StringBuilder sb =  new StringBuilder(s);
   sb=sb.reverse();
   String k = sb.toString();
   return s.equals(k); 
        
    }
}