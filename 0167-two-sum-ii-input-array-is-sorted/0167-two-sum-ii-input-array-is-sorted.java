class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum;
        for(int i=0;i<numbers.length;i++)
    {
        sum=target-numbers[i];
        if(hm.containsKey(sum))
        {
            return new int[]{hm.get(sum)+1,i+1};
        }
     
            hm.put(numbers[i],i);
        
    }
        return new int[]{};
    }
}