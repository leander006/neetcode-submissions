class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String s : strs){
            String key = cal(s);
            if(res.containsKey(key)){
                res.get(key).add(s);
            }else{
                List<String> res1 = new ArrayList<>();
                res1.add(s);
                res.put(key,res1);
            }
        }
        for(Map.Entry<String,List<String>> map : res.entrySet()){
            result.add(map.getValue());
        }
        return result;
    }
    public String cal(String s){
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        return Arrays.toString(arr);
    }
}
