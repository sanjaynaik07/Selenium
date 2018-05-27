package com.first;
import java.io.*;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f =new FileInputStream("C:\\Users\\SANJAY\\Desktop\\ssc.txt");
FileOutputStream o=new FileOutputStream("C:\\\\Users\\\\SANJAY\\\\Desktop\\\\ss2c.txt");

BufferedInputStream b= new BufferedInputStream(f);

int k=b.read();
System.out.println(k);




/*
 int k=f.available();
 system.out.println(k);
int i=0;
while((i=f.read())!=-1)
{
	o.write(i);
System.out.print((char)i);
}
f.close();

*/



	}

}
