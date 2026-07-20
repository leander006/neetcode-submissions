class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int val = map.getOrDefault(num,0)+1;
            map.put(num,val);
            if(val > 1){
                return true;
            }
        }
        return false;
    }
}