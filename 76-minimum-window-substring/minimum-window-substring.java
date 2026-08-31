class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character, Integer> count = new HashMap<>();
        for(char c : t.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int need = count.size();
        int have = 0;

        int[] res = {-1, -1};
        int len = Integer.MAX_VALUE;

        int l = 0;
        for(int r = 0; r < s.length(); r++){

            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(count.containsKey(c) && window.get(c).intValue() == count.get(c).intValue()){
                have++;
            }

            while(have == need){
                if((r-l+1) < len){
                    res = new int[] {l, r};
                    len = r-l+1;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if(count.containsKey(leftChar) && window.get(leftChar) < count.get(leftChar)){
                    have--;
                }
                l++;

            }
        }
        l = res[0];
        int r = res[1];
        return len != Integer.MAX_VALUE ? s.substring(l, r + 1) : "";
    }
}