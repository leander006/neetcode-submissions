class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        Map<Character,Integer> mp = new HashMap<>();
        int res =0;
        int maxF = 0;
        while(j<s.length()){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            maxF = Math.max(maxF,mp.get(s.charAt(j)));
            while((j-i+1) - maxF > k){
                mp.put(s.charAt(i),mp.get(s.charAt(i)) -  1);
                i++;
            }
            res = Math.max(res,(j-i+1));
            j++;
        }
        return res;
    }
}
