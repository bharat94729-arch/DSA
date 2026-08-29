class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);                              // 1
        List<List<Integer>> result = new ArrayList<>();  // 2
        int prev = lower - 1;                             // 3

        for (int num : nums) {                            // 4
            if (num < lower || num > upper) continue;      // 5
            if (num - prev >= 2) {                          // 6
                result.add(Arrays.asList(prev + 1, num - 1)); // 7
            }
            prev = Math.max(prev, num);                     // 8
        }

        if (upper - prev >= 1) {                          // 9
            result.add(Arrays.asList(prev + 1, upper));      // 10
        }

        return result; 
    }
}