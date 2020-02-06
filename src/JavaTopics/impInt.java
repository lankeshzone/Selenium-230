package JavaTopics;

public class impInt extends getSet implements intOne, intTwo
{

	public static void main(String[] args) 
	{
	impInt i1 = new impInt();
	i1.m1();
	i1.m2();
	i1.m3();
	i1.m10();
	}

	
	public void m1()
	{
		System.out.println("Iam method one from interface");
	}
	
	public void m2()
	{
		System.out.println("Iam method two from interface");
	}
	
	public void m3()
	{
		System.out.println("Iam method three from interface");
	}
}
