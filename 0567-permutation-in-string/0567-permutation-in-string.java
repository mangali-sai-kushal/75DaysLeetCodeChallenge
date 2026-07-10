class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] freq=new int[26];
        for(char ch:s1.toCharArray())
        {
            freq[ch-'a']++;
        }
        int left=0,right=0;
        int[] f=new int[26];
        while(right<m)
        {
            char ch1=s2.charAt(right);
            f[ch1-'a']++;
            if(right-left+1==n)
            {
                if(Arrays.equals(freq,f))
                {
                    return true;
                }
                f[s2.charAt(left)-'a']--;
                left++;
            }
            right++;
            
        }
        return false;
    }
}