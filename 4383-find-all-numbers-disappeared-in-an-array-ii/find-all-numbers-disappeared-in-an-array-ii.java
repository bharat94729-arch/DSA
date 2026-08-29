class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        TreeSet<Integer> s = new TreeSet<>();
        for(int num : nums){
            s.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        int prev = lower - 1;

        for(int x : s){
            if(x < lower || x > upper) continue;
            if(x - prev >= 2){
                result.add(Arrays.asList(prev+1, x-1));
            }
            prev = x;
        }
        if(upper - prev >= 1){
            result.add(Arrays.asList(prev+1, upper));
        }

        return result;
    }
}