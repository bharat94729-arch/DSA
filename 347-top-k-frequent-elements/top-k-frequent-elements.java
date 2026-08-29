class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num, h.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> h.get(a) - h.get(b));

        for(int num : h.keySet()){
            heap.offer(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }
        return result;
    }
}