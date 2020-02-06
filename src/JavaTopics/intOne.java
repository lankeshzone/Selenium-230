package JavaTopics;

public interface intOne
{

	void m1();
	abstract void m2();
	
	static void m3()
	{
		System.out.println("static method in interface");
	}
	

	public static void main(String[] args)
	{
		m3();
		
	}
	
}
