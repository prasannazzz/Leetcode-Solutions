class Solution {
    public int removeDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet<>(); // To store unique elements
    int index = 0; // Tracks the position to overwrite the array
    for (int num : nums) {
            if (!set.contains(num)) { // If the number is not already in the set
                set.add(num); // Add it to the set
                nums[index] = num; // Place it in the current position of the array
                index++;
            }
        }
        return index; // Length of the array with unique elements
    }
}
