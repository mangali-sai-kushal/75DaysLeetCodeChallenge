class Solution {
    public boolean isIsomorphic(String a, String b) {
        if (a.length()!=b.length())
       {
           return false;
       }
       Map<Character,Character> map1=new HashMap<>();
       Map<Character,Character> map2=new HashMap<>();
       for (int i=0;i<a.length();i++)
       {
           if(map1.containsKey(a.charAt(i)))
           {
              if(!map1.get(a.charAt(i)).equals(b.charAt(i)))
              {
                  return false;
              }
           }else {
               map1.put(a.charAt(i), b.charAt(i));
           }

       }
       for (int i=0;i<b.length();i++)
       {
           if(map2.containsKey(b.charAt(i)))
           {
               if(!map2.get(b.charAt(i)).equals(a.charAt(i)))
               {
                   return false;
               }
           }else {
               map2.put(b.charAt(i),a.charAt(i));
           }
       }

       return true;
        
    }
}