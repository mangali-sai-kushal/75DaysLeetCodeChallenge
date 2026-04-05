class Solution {
    public int findKthLargest(int[] nums, int k) {
                PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // keep only k elements
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        return minHeap.peek(); // kth largest

        
    }
}