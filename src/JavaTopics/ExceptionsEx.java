package JavaTopics;

import java.io.File;
import java.io.IOException;

public class ExceptionsEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub - Lankesh

		int[] a = new int[2];
		
		a[0]=100;
		a[1]=200;
		
		try // allowing the process to continue
		{
			a[1]= 300;
			File f= new File("D:\\Test\\dfgdg.txt");
			f.createNewFile();
		}
		catch(IOException e) // if there is an issue in the try block 
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i.getMessage());
		}
		finally
		{
			System.out.println("This is finally which will execute");
		}
		
		
		System.out.println("this is continuation");
	}

}
