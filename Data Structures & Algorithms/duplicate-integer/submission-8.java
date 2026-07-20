class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int val = map.getOrDefault(num,0)+1;
            System.out.println("nums "+num + " val "+val);
            map.put(num,val);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
            if(mp.getValue() >1){
                return true;
            }
        }
        return false;
    }
}