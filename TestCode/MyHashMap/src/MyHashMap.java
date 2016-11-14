
public class MyHashMap {
	  private static final int ARRAYSIZE = 16;
	  private Entry table [] = new  Entry[ARRAYSIZE];
	  
	  class Entry {
		  final String mKey;
		  String mValue;
		  Entry next;
		  
		  Entry(String k, String v) {
			  mKey = k;
			  mValue = v;
		  }
		  
		  public String getValue() {
			  return mValue;
		  }
		  
		  public void setValue(String value) {
			  mValue = value;
		  }
		  
		  public String getKey() {
			  return mKey;
		  }
	  }
	  
	  public Entry get(String k) {
		  int hash = k.hashCode() % ARRAYSIZE;//use string hashcode function modulo array size
		  Entry e = table[hash];
		  
		  while (e != null) {
			  if (e.mKey.equals(k)) {
				  return e;				  
			  }
			  e = e.next;
		  }
		  return null;
	  }
	  
	  public void put(String k, String v) {
	        int hash = k.hashCode() % ARRAYSIZE;
	        Entry e = table[hash];
	        if(e != null) {
	            // it means we are trying to insert duplicate
	            // key-value pair, hence overwrite the current
	            // pair with the old pair
	            if(e.mKey.equals(k)) {
	                e.mValue = v;
	            } else {
	                // traverse to the end of the list and insert new element 
	                // in the same bucket
	                while(e.next != null) {
	                    e = e.next;
	                }
	                Entry entryInOldBucket = new Entry(k, v);
	                e.next = entryInOldBucket;
	            }
	        } else {
	            // new element in the map, hence creating new bucket
	            Entry entryInNewBucket = new Entry(k, v);
	            table[hash] = entryInNewBucket;
	        }
	    }
	 
	    // for testing our own map
	    public static void main(String[] args) {
	        MyHashMap tmhm = new MyHashMap();
	 
	        tmhm.put("Akshay", "SMTS");
	        tmhm.put("Maku", "SSE");
	        tmhm.put("Niranjan", "SMTS1");
	        tmhm.put("Chandu", "SSE");
	 
	        Entry e = tmhm.get("Akshay");
	        System.out.println(""+e.getValue());
	        char [] myChar = new char [10];
	        
	        
	    }
	    
	    
	  

}
