class Solution {
        public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums) {
            deque.addLast(num);
        }
        for (int i = 0; i < k; i++) {
            int last = deque.removeLast(); // Remove from back
            deque.addFirst(last);         // Add to front
        }
        int index = 0;
        for (int num : deque) {
            nums[index++] = num;
        }
    } 
    }



