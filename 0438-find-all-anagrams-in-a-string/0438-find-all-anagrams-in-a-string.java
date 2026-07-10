class Solution {
    static List<Integer> findAnagrams(String s,String p)
    {
        List<Integer> res=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        int left=0,right=0;
        Map<Character,Integer> map1=new HashMap<>();
        for(char ch:p.toCharArray())
        {
         map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> map2=new HashMap<>();
        while(right<n)
        {
             char ch1=s.charAt(right);
             map2.put(ch1,map2.getOrDefault(ch1,0)+1);

            if(right-left+1==m)
            {
                if(map1.equals(map2))
                {
                    res.add(left);

                }
                if(map2.get(s.charAt(left))==1)
                {
                    map2.remove(s.charAt(left));
                }else{
                    map2.put(s.charAt(left),map2.get(s.charAt(left))-1);

                }
                left++;
            }
            right++;



        }

        return res;
    }
    
}