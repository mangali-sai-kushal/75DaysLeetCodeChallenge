class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        int maxfreq=0;
        int cnt=0;
        int left=0,right=0;
        int n=s.length();
        while (right< n)
        {
           char ch=s.charAt(right);
           map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));

            while(right-left+1-maxfreq>k)
           {
               if(map.get(s.charAt(left))==1)
               {
                   map.remove(s.charAt(left));
               }else{
                   map.put(s.charAt(left),map.get(s.charAt(left))-1);

               }
               left++;
           }
            maxfreq=Math.max(maxfreq,map.get(ch));


           int len=right-left+1;
           if(len-maxfreq<=k)
           {
            cnt=Math.max(cnt,len);
           }
           right++;
        }
        return cnt;
        
    }
}