class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> counterMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            int stringValue = counterMap.getOrDefault(s.charAt(i),0);
            counterMap.put(s.charAt(i),stringValue+1);
        }
        for(int i=0;i<t.length();i++){
            if(counterMap.containsKey(t.charAt(i))){
                int stringValue = counterMap.get(t.charAt(i));
                if(stringValue <=1){
                    counterMap.remove(t.charAt(i));
                }
                else{
                    counterMap.put(t.charAt(i),stringValue - 1);
                }
            }
            else{
                counterMap.put(t.charAt(i),1);
            }
        }
        return counterMap.isEmpty();
    }
}
