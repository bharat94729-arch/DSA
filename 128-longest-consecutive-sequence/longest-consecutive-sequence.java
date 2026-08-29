class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> map = new HashSet<>();
        for(int num : nums){
            map.add(num);
        }
        
        int max = 0;
        for(int currentValue : map){
            
            if(!map.contains(currentValue+1)){
                int count = 1;
                int tempValue = currentValue;
                while(map.contains(tempValue-1)){
                count++;
                tempValue--;
                }
                max = Math.max(max, count);
            }
            
            
        }
        return max;
    }
}