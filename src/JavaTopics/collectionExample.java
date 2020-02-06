package JavaTopics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class collectionExample 
{
	
	public static void main(String[] args)
	{	
		child c= new child();

		HashSet<Character> hs1 = new HashSet<Character>();
		
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(100);
		p1.add(200);
		p1.add(300);
		
		System.out.println("peek method " + p1.peek());
		System.out.println("elements in queue " + p1);
		
		p1.poll();
		System.out.println("elements in queue " + p1);
		
		
		
		//integer type collection
		ArrayList<Integer> a1 = new ArrayList<Integer>();	
		a1.add(100);
		a1.add(200);
		a1.add(345);
		

		
		//object type
		ArrayList<Object> a4 = new ArrayList<Object>();
		a4.add("Deepika");
		a4.add(700);
		
		ArrayList<Object> a2 = new ArrayList<Object>();
		a2.add("lankesh");
		a2.add(100);
		a2.add('c');
		a2.add(0.35f);
		a2.add(c);
		
		System.out.println("contains : " + a2.contains('c'));
		System.out.println("Size "+a2.size());
		
		a2.addAll(a4);
		System.out.println("elements in a2 " + a2);
		System.out.println("Size "+a2.size());
		
		a2.removeAll(a4);
		
		System.out.println("elements in a2 " + a2);
		System.out.println("Size "+a2.size());
		a2.remove(3);
		System.out.println("elements in a2 " + a2);
		System.out.println("Size "+a2.size());
	
		System.out.println("get at index 2 " + a2.get(2));
		Iterator i = a2.iterator();
		
		while(i.hasNext())
			System.out.println("elements in a2 " + i.next());
			
		Object[] o = new Object[100];
		o=a2.toArray();
		
		for(int k=0; k< o.length;k++)
			System.out.println("object array " + o[k]);
		
		
		
		//COmparable - add any value
		ArrayList<Comparable> a3 = new ArrayList<Comparable>();
		a3.add(0.35f);
		a3.add('d');
		a3.add(200);

	
}
}