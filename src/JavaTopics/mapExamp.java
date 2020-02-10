package JavaTopics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class mapExamp {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		LinkedHashMap<String,String> l1 = new LinkedHashMap<String,String>();
		
		l1.put("C100","Rajeev");
		l1.put("C101", "Usha");
		l1.put("C102", "Beena");
		
		System.out.println(l1);
		
		Set<String> s2 = l1.keySet();
		
		for(String s : s2)
			System.out.println(s);
		
		Collection<String> s3 = l1.values();
		
		for(String s : s3)
			System.out.println(s);
		
		m.put(1, "lankesh");
		m.put(2,"Deepika");
		m.put(3, "Gauthami");
		
		System.out.println(m);
		
		Set<Integer> s = m.keySet();
		Collection<String> v = m.values();
		
		for(int i : s)
			System.out.println(i);
			
		for(String i : v)
			System.out.println(i);
		
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("test"));
		
		m.replace(2, "Century");
		
		System.out.println(m);	
	}
}