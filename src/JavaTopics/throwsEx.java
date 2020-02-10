package JavaTopics;

import java.io.File;
import java.io.IOException;

public class throwsEx {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub - Lankesh

		//throwsEx.m1();
		
		int i=100;
		
		int[] a = new int[3];
		
		int index = 4;
		
		//throw new Exception("sample exception");
		
		
		if (index>a.length)
			throw new ArrayIndexOutOfBoundsException("i do not want to continue");
		else
			a[index]= 100;
	
	}
	
	
	public static void m1() throws IOException
	{
		File f= new File("D:\\Test\\Test100.txt");
		
		
		f.createNewFile();
		
		File f2 = new File("");
		
		f2.createNewFile();
	
	}

}
