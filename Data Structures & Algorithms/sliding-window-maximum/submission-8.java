
class Solution { 
    public int[] maxSlidingWindow(int[] nums, int k) { 
        // CHANGED: Use Deque instead of List for performance, storing INDICES instead of values
        Deque<Integer> store = new ArrayDeque<>(); 
        int i=0, j=0; 
        List<Integer> res = new ArrayList<>(); 
        
        while(j < nums.length){ 
            // CHANGED: Compare array values using the indices stored inside the deque
            while(store.size() > 0 && nums[store.peekLast()] < nums[j]){ 
                store.removeLast(); 
            } 
            
            // CHANGED: Add the current index 'j' to the store instead of the value
            store.addLast(j); 
            
            if(j-i+1 < k){ 
                j++; 
            } else if(j-i+1 == k){ 
                // CHANGED: The maximum value is at the index stored at the front
                res.add(nums[store.peekFirst()]); 
                
                // CHANGED: Check if the index at the front matches the exiting index 'i'
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