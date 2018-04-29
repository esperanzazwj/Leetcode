class LRUCache {
    LinkedList<Integer> cache = null;
    Map<Integer,Integer> map = null;
    int capacity;
    
    public LRUCache(int capacity) {
        this.cache = new LinkedList<>();
        this.map = new HashMap<>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            if(this.cache.peek()!=key){
                this.cache.removeFirstOccurrence(key); 
                this.cache.addFirst(key);
            }
            return map.get(key);
        }
        else
            return -1;
    }
    
    public void put(int key, int value) {
        if(get(key)==-1){
            if(this.cache.size()==this.capacity)
                this.map.remove(this.cache.removeLast());
            this.cache.addFirst(key);
        }
        this.map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */