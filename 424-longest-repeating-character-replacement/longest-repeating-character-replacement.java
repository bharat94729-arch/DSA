class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        int maxF = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);

            count.put(c, count.getOrDefault(c, 0) + 1);
            maxF = Math.max(maxF, count.get(c));

            if((r - l + 1) - maxF > k){
                char leftChar = s.charAt(l);
                count.put(leftChar, count.get(leftChar) - 1);
                l++;
            } 

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;

    }
}