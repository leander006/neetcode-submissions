class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> duplicateMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentValue = duplicateMap.getOrDefault(nums[i],0);
            if(currentValue>0){
                return true;
            }
            duplicateMap.put(nums[i],(currentValue+1));

        }
        return false;
    }
}