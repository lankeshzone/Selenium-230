package JavaTopics;

public class C2 extends child
{

	public static void main(String[] args)
	{
		C2 c = new C2(); // c2 to execute (or) c2-->child-->parent..
		
		
		//c.m1(200);
	}
	
	public void m1(int x)
	{
			
		this.m2(); // current class
		super.m2();  // immediate parent
	}

	
	public static String m5()
	{
		return "test";
	}
	
	public void m2()
	{
		System.out.println("Iam m2 in child-2");
	}

	public C2()
	{
		System.out.println("Iam constructor in C2");
	}
	
}
