import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false; 
        for (int size = l; size <= r; size++) {
            int windowSum = 0;
            for (int i = 0; i < size; i++) {
                windowSum += nums.get(i);
            }
            if (windowSum > 0) {
                minSum = Math.min(minSum, windowSum);
                found = true;
            }
            for (int i = size; i < n; i++) {
                windowSum += nums.get(i) - nums.get(i - size); 
                if (windowSum > 0) {
                    minSum = Math.min(minSum, windowSum);
                    found = true;
                }
            }
        }
        return found ? minSum : -1;
    }

}

    
    