class Solution {
    public int maximumDifference(int[] nums) {
        int profit=-1;
        int n=nums.length;
        int min=nums[0];
        int dif;
        for(int i=1;i<n;i++)
        {
          dif=nums[i]-min;
          profit=Math.max(dif,profit);
          min=Math.min(min,nums[i]);
        }
        if(profit<= 0)
        {
            return -1;
        }
        return profit;
    }
}