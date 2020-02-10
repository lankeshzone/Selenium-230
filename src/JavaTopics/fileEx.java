package JavaTopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileEx 
{

	public static void main(String[] args) throws IOException 
	{
		//absolute file path
		File f = new File("D:\\gutyugiu\\Test123.txt"); 
		
		if(!f.exists()) // return whether file is available or not
		f.createNewFile(); // it will create a new file

		
		
		//character by character
		FileWriter fw = new FileWriter(f);
		fw.write('s');
		fw.write("This is selenium classes");
		fw.flush();
		
		fw.append(" append info");
		fw.close();
		
		FileReader fr = new FileReader(f);
		char[] c = new char[100];
		fr.read(c);
		for (int i=0;i<c.length;i++)
			System.out.print(c[i]);
		
		FileOutputStream fos = new FileOutputStream(f);
		String s = " India Bangalore";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.write(100);
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis.available());
		byte[] d = new byte[100];
		fis.read(d);
		for(int i=0; i<d.length;i++)
			System.out.print((char)d[i]);
		
	}

}
