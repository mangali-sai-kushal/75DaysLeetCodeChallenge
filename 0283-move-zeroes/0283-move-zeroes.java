class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1)
{
    return;
}
        int l=0;
        int r=1;
        while(r<n && l<r)
        {
            if(nums[l]==0 && nums[r]!=0)
            {
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
                r++;
           }else if(nums[l]!=0 )
           {
            l++;
            r++;
           }else if(nums[l]==0 && nums[r]==0)
           {
            r++;
           }

        }

    }
}