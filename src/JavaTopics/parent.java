package JavaTopics;

public class parent {
	
	
	static int x = 100;
	int y=200;
	
	
	final int z = 100;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("static variable x " + parent.x);
		
		
		//final-finally-finalize
		
		// collection (Derived data type) - collections (class)
		
		// Object ??? 
		
		//non-static/instance
		
		parent p = new parent(); //parent constructor to execute
		System.out.println("non-static var y " + p.y);

		
		p.x= 300;
	}

	public void m2()
	{
		System.out.println("Iam m2 in parent");
	}
	
	public parent()
	{
		System.out.println("Iam constructor in parent");
	}
	
}
