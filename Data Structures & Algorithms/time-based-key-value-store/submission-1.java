class TimeMap {

    private Map<String,List<Pair<Integer,String>>> keyStore;
    public TimeMap() {
        keyStore = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        keyStore.computeIfAbsent(key,k -> new ArrayList<>()).add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer,String>> val = keyStore.getOrDefault(key, new ArrayList<>());

        int l = 0 , r = val.size() -1 ; 
        String res = "";

        while(l <=r ){
            int mid = l + (r - l )/2;

            if(val.get(mid).getKey() <= timestamp){
                res = val.get(mid).getValue();
                l = mid +1;
            }else{
                r= mid -1;
            }
        }
        return res;
    }

    private static class Pair<K,V>{
        private final K key;
        private final V val;

        public Pair(K key,V val){
            this.key = key;
            this.val = val;
        }

        public K getKey(){
            return key;
        }
        public V getValue(){
            return val;
        }
    }
}
