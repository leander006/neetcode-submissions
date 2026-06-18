class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> searchMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int diff = target - nums[i];
            if(searchMap.containsKey(diff) && searchMap.get(diff) != i){
                return new int[]{searchMap.get(diff),i};
            }
            else{
               searchMap.put(nums[i],i); 
            }
        }
        return res;
    }
}
