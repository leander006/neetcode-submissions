class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        Map<Character,Integer> mp = new HashMap<>();
        int res =0;
        while(j<s.length()){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);

            if(mp.size() == j-i+1){
                res = Math.max(res,mp.size());
            }else if (mp.size() < j-i+1){
                while(mp.size() < j-i+1){
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i)) == 0){
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return res;
    }
}
