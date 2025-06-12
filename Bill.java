import java.io.*;
class Bill
{
 public static void main(String arg[])
 {
  try
  {
   DataInputStream dis = new DataInputStream(System.in); 
   System.out.println("GOVERMENT OF TAMILNADU");
   System.out.println("Electricity Bill");
   System.out.println("-----------------------");
   System.out.println("-----------------------");
   System.out.println("Enter The EB-NO:");
   String s1 = dis.readLine();
   int a = Integer.parseInt(s1);
   System.out.println("Enter The Customer Name:");
   String s2 = dis.readLine();
   System.out.println("Enter The Previous Unit:");
   String s3 = dis.readLine();
   int b = Integer.parseInt(s3);
   System.out.println("Enter The  Current Unit:");
   String s4 = dis.readLine();
   int c = Integer.parseInt(s4);
   System.out.println("RESULT");
   int x=c-b;
   System.out.println("Unit Consumed:"+x);
   int d=c-b*5;
   System.out.println("Total Amount Rs:"+d);
   }
   catch(Exception e)
   {
   System.out.println("Error:"+e.getMessage());
   }
 }
}

