class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> freq[] = new List[nums.length + 1];
        Map<Integer,Integer> map = new HashMap<>();
        int result[] = new int[k];

        for(int i=0;i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            freq[mp.getValue()].add(mp.getKey());
        }
        int index =0;
        for(int i=freq.length-1;i>0 && index < k ;i--){
            
            for(int n:freq[i]){
                result[index++] = n;
                if(index == k){
                    return result;
                }
            }
        }
        return result;
    }
}
