import java.io.*;
class Arithematic
{
 public static void main(String args[])
{
 try
{ 
 DataInputStream isr=new DataInputStream(System.in);
 
 System.out.println("Arithematic");
 System.out.println("-----------");
 System.out.println("Enter first number:");
 String s1=isr.readLine();
 System.out.println("Enter Second number:");
 String s2=isr.readLine();
 System.out.println("Report");
 System.out.println("------");
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 int c=a+b;
 System.out.println("add:"+c);
 c=a/b;
 System.out.println("add:"+c);
 c=a%b;
 System.out.println("add:"+c);
}
catch(Exception e)
{
	System.out.println("Error:"+e.getMessage());
}
}

}