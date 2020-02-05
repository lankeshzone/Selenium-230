package JavaTopics;

import java.util.Arrays;

public class arraysEx {

	public static void main(String[] args) 
	{
		int[] a = new int[3];
		
		a[0]= 9100;
		a[1]= 7200;
		a[2] = 3400;
		
		Arrays.sort(a);
		
		System.out.println("length  " + a.length);
		
		//no compilation problem but throws indexoutofrange
		//exception during run time
		
		//a[3] = 400;
		
		for (int i= 0;i<3; i++)
			System.out.println("array value " + a[i]);

		System.out.println("Search for 3400 " + Arrays.binarySearch(a, 3400));
		
		int[] b = {3400,7200,9100};
		
		System.out.println("compare arrays " + Arrays.compare(a, b));
		
		parent p1 = new parent();
		parent p2 = new parent();
		parent p3 = new parent();
		
		parent[] xyz = new parent[4];
		
		xyz[0]= p1;
		xyz[1]= p2;
		xyz[2]= p3;
		
		for (int i=0; i<3; i++)
			System.out.println("parent object array "+ xyz[i]);
		
	}

}
