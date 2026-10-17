class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        boolean[] composite = new boolean[n+1];

        for(int i = 2; i*i <= n; i++){
            if(!composite[i]){
                for(int j = i*i; j <= n; j += i){
                    composite[j] = true;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for(int a = 2; a <= n; a++){
            if(composite[a]) continue;
            sum += a;
            if(sum > s) break;
            result.add(a);
            
        }
        return result;
    }
}