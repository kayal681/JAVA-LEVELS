import java.io.*;
class Takshashila
{
 public static void main(String arg[])
 {
  try
  {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("TAKSHASHILA UNIVERSITY");
   System.out.println("------------------------");
   System.out.println("Student Mark List");
   
   System.out.println("Enter The Enroll Number:");
   String s1 = br.readLine();
   
   System.out.println("Enter The Student Name:");
   String s2 = br.readLine();
   
   System.out.println("Enter The Java Mark:");
   String s3 = br.readLine();
   int a = Integer.parseInt(s3);
   
   System.out.println("Enter The SE Mark:");
   String s4 = br.readLine();
   int b = Integer.parseInt(s4);
   System.out.println("Enter The CN Mark:");
   String s5 = br.readLine();
   int c = Integer.parseInt(s5);
   System.out.println("Result");
   int d = a+b+c;
   System.out.println("Total:"+d);
   d = a+b+c/3;
   System.out.println("Average:"+d);
   }
    catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
 }
}

