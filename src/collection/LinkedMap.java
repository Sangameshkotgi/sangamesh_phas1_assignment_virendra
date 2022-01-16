package collection;

import java.util.LinkedHashMap;

public class LinkedMap{

	public static void main(String[] args) {
		
		 LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		 linkedHashMap.put(1,new String("apple"));
		 linkedHashMap.put(2,new String("banana"));
		 linkedHashMap.put(3,new String("carrot"));
		 linkedHashMap.put(4,new String("dryfruit"));
		 linkedHashMap.put(5,new String("falooda"));
		 linkedHashMap.put(6,new String("grapes"));
		 linkedHashMap.put(7,new String("guava"));
		 linkedHashMap.put(8,new String("mango"));
		 linkedHashMap.put(9,new String("chickoo"));
		 linkedHashMap.put(10,new String("orange"));
				
		System.out.println("Hashmap is "+linkedHashMap);
		for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
	
	
		
		  System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
	        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
	        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(4));
	        System.out.println("LinkedHashMap contains apple as value? : " + linkedHashMap.containsValue("apple"));
	        System.out.println("LinkedHashMap contains banana as value? : " + linkedHashMap.containsValue("banana"));
	        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove("dryfruit"));
	        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove("guava"));
	        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
	       
	        linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	}
}





