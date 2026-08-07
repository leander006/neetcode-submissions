class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> store = new ArrayDeque<>(); 
        int i=0,j=0,index=0;
        int[] res = new int[nums.length -k+1];
        while(j<nums.length){
            while(store.size() >0 && nums[store.peekLast()] < nums[j]){
                store.removeLast();
            }
            store.addLast(j);
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                res[index++] = nums[store.peekFirst()];
                if(store.peekFirst() == i){
                    store.removeFirst();
                }
                i++;
                j++;
            }
        }
        return res;
    }
}
