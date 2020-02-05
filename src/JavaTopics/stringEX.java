package JavaTopics;

public class stringEX {

	public static void main(String[] args) 
	{
	
		String str1 = new String("India");
		
		String str2 = "Bangalore";
		
		
		System.out.println("CHaracter at" + str1.charAt(3));
		
		
		System.out.println("compare to " +  str1.compareTo(str2));
		
		System.out.println("Concat " + str1.concat(str2));
		
		System.out.println("str1 values  : " + str1);
		
		System.out.println("index of " + str1.indexOf('d'));
		
		System.out.println("replace " + str1.replace('i', 'x'));
		
		System.out.println("substring " + str1.substring(2));
	
		String[] s = str1.split("dia", 2);
		
		for (int i=0; i<s.length;i++)
		System.out.println("split " + s[i]);
		
		System.out.println(" contains " + str1.contains("dia"));
		
		System.out.println(str1.equals("India"));
		
		stringEX s1 = new stringEX();
		stringEX s12 = new stringEX();
		
		System.out.println("class equals " + s1.equals(s12));
		
		StringBuilder t1 = new StringBuilder("test");
		
		System.out.println("Before " + t1);
		t1.append("123");
		System.out.println("After " + t1);
		
		
		
		
	
	}

}
