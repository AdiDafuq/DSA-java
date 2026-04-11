class Solution {
    //DSA1
    public int[] twoSum(int[] nums, int target) {
        // This loop goes through every number (same as your i loop)
        for (int i = 0; i < nums.length; i++) {
            
            // This loop looks at numbers AFTER i (to avoid using the same one twice)
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if they add up to the target
                if (nums[i] + nums[j] == target) {
                    // RETURN the pair of indices as a new array
                    return new int[] { i, j };
                }
            }
        }
        
        // This is a safety line in case no answer is found
        return new int[] {};
    }
}
