package JavaTopics;

public abstract class test {
	int x=20;
	static int y = 30;
	final float f = 3.45f;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test t = new test();
		
		test.m3();
	}
	
	abstract public void m1();
	
	public void m2()
	{
		
	}
	
	public static void m3()
	{
		System.out.println("static method " + y);
	}
}
