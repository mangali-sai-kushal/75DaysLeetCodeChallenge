class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        { 
            while(!s.isEmpty() && temperatures[i]>= temperatures[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty()) {ans[i] = 0;
            }
else{ ans[i] = s.peek() - i;
}
            s.push(i);

        }
        return ans;
        
    }
}