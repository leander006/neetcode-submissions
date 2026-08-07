class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> store = new ArrayDeque<>(); 
        int i=0,j=0;
        List<Integer> res = new ArrayList<>();
        while(j<nums.length){
            while(store.size() >0 && nums[store.peekLast()] < nums[j]){
                store.removeLast();
            }
            store.addLast(j);
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                res.add(nums[store.peekFirst()]);
                if(store.peekFirst() == i){
                    store.removeFirst();
                }
                i++;
                j++;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
