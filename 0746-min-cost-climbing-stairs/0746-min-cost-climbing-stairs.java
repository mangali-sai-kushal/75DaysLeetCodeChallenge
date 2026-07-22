class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1)
        {
            return cost[0];
        }
        if(n==2)
        {
            return Math.min(cost[0],cost[1]);
        }
        int p1=cost[0],p2=cost[1];
        for(int i=2;i<n;i++)
        {
            int cur=Math.min(p1,p2)+cost[i];
            p1=p2;
            p2=cur;
        }
        return Math.min(p1,p2);
        
    }
}