class MyHashMap {
    // public static Map<Integer,Integer> myMap; 
     int[] mapArr;
     public MyHashMap() {
       //  myMap = new HashMap<Integer,Integer>();
       mapArr = new int[(int)Math.pow(10,6)+1];
       Arrays.fill(mapArr,-1);
     }
     
     public void put(int key, int value) {
       //  myMap.put(key,value);
        mapArr[key] = value; 
     }
     
     public int get(int key) {
        /* if(!myMap.isEmpty())
             return myMap.get(key);
         return 0;*/
         return mapArr[key];
     }
     
     public void remove(int key) {
       // myMap.remove(key, myMap.get(key));
       mapArr[key] = -1; 
     }
 }
 
 /**
  * Your MyHashMap object will be instantiated and called as such:
  * MyHashMap obj = new MyHashMap();
  * obj.put(key,value);
  * int param_2 = obj.get(key);
  * obj.remove(key);
  */