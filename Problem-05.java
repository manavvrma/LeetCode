// 347. Top K Frequent Elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map <Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);

        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(
            (a,b) -> a.getValue()-b.getValue()
            );

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] topK = new int[k];

        int i = 0;
        while(!heap.isEmpty()){
            topK[i++] = heap.poll().getKey();
        }
        return topK;
    }
}
