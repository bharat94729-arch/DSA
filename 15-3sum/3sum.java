class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0){
                break;
            }
            int l = i + 1;
            int r = n - 1;

            while(l < r){
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0){
                    r--;
                }else if(threeSum < 0){
                    l++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }
            }


        }
        return result;
    }
}