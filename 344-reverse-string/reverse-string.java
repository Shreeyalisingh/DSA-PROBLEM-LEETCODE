class Solution {
    public void reverseString(char[] s) {
        int n= s.length;
       char a = 'a';
        for(int i=0;i<n/2;i++ )
        { 
         a=s[(n-1)-i];
         s[(n-1)-i]=s[i];
         s[i]=a;

        }

        
    }
}