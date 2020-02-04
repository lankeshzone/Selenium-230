package JavaTopics;

public class child extends parent
{
	
	int x = 200;

	public static void main(String[] args) 
	{

		System.out.println();
		
		
		child c= new child(); //child constructor to execute (or) child followed by parent constructor
		
		
		//c.m1(300);
	}
	
	public void m1(int x)
	{
		System.out.println("variable x " + x); // local variable(parameter)
		System.out.println("using this for x " + this.x); // this variable is class
		System.out.println("using super for x " + super.x); // super is for parent 
		
		this.m2(); // child class
		super.m2();  //parent class
	}

	public void m2()
	{
		System.out.println("this is m2 in child");
	}
	
	public child()
	{
		System.out.println("Iam constructor in child");
	}
}
