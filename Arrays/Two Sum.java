import java.util.*;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int[] ans = new int[2];

//         for (int i=0; i<nums.length; i++)
//             map.put(nums[i], i);
//         for (int i=0; i<nums.length; i++) {
//             if (map.containsKey(target-nums[i])&& map.get(target-nums[i]) != i) {
//                 ans[0] = i;
//                 ans[1] = map.get(target-nums[i]);
//                 return ans;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }

        return new int[] {}; // No solution found
    }
}