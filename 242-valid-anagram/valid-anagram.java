class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int n1 = t.length();
        if(n!=n1)
        return false;

        HashMap <String,Integer> tm1 = new HashMap<>();
        
        for(char i : s.toCharArray())
        {  String key = String.valueOf(i);
            if(tm1.containsKey(key))
            tm1.put(key,tm1.get(key)+1);
            else
            tm1.put(key,1);
        }
        for(char i : t.toCharArray())
        {  String key = String.valueOf(i);
                if(tm1.containsKey(key))
              tm1.put(key ,tm1.get(key)-1);
        }
        
       

Set<String> entry = tm1.keySet();


for(String i : entry)
{
    if(tm1.get(i)!=0 )
    return false ;
     
}


  return true;  }
}