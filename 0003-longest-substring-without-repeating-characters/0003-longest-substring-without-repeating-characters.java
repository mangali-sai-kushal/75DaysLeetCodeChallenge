class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        
        {
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int left=0,right=0;
        Set<Character> hs=new HashSet<>();
        while(right<s.length())
        {
            if(hs.contains(s.charAt(right)))
            {
                 while(hs.contains(s.charAt(right)))
                 {
                    hs.remove(s.charAt(left));
                    left++;
                 }

            }
                hs.add(s.charAt(right));
                max=Math.max(max,right-left+1);
                right++;

            
        }

        return max;
    }
}