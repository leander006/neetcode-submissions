class Solution {
    public String minWindow(String s, String t) {
        int i=0,j=0;
        int minIdx =0;
        int minLen = Integer.MAX_VALUE;
        int count =0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int k=0;k<t.length();k++){
            mp.put(t.charAt(k),mp.getOrDefault(t.charAt(k),0) + 1);
        }
        count = mp.size();

        while(j<s.length()){
            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),mp.get(s.charAt(j)) - 1);
                if(mp.get(s.charAt(j)) == 0){
                    count--;
                }
            }
            while(count == 0){
                if(j-i+1 < minLen){
                    minIdx = i;
                    minLen = j-i+1;
                }
                if(mp.containsKey(s.charAt(i))){
                     mp.put(s.charAt(i),mp.get(s.charAt(i)) + 1);
                     if(mp.get(s.charAt(i)) > 0){
                        count++;
                     }
                }
                i++;
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(minIdx,minIdx+minLen);
    }
}
