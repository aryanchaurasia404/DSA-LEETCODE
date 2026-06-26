import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Find the required number
            int complement = target - nums[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {

                // Return indices
                return new int[]{map.get(complement), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // This line will never execute because one solution always exists
        return new int[]{};
    }
}