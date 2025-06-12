import java.io.*;
class salary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			
			System.out.println("KAYAL INTERNATIONAL [P] Ltd");
			System.out.println("Ongur,Tindivanam,Villupuram");
			System.out.println("___________________________");
			System.out.println("Salary Bill Recepit");
			System.out.println("---------------------------");
			
			System.out.println("Enter the Employee ID:");
			String s1=dis.readLine();
			int a = Integer.parseInt(s1);
			
			System.out.println("Enter The Employee Name:");
			String s2 = dis.readLine();
			
			System.out.println("Enter the Salary:");
			String s3=dis.readLine();
			int b = Integer.parseInt(s3);
			
			System.out.println("INCOME:");
			System.out.println("------------------");
			
			int bon = a*20/100;
			System.out.println("BONUS(20% From Sal):"+bon);
			
			int inc = a*10/100;
			System.out.println("INCREMENT(10% From Sal):"+inc);
			
		    int sal = a*5/100;
			System.out.println("OverTime(5% From Sal):"+sal);
			
			int gran = a+ bon+inc+sal;
			System.out.println("Grand Total:"+gran);
			
			System.out.println("Expenditure");
			
			int lic = a*2/100;
			System.out.println("LIC(2%from sal):"+lic);
			
			int hra= a*3/100;
			System.out.println("HRA(3% from sal):"+hra);
			
			int net = gran-lic-hra;
			System.out.println("Net Total:"+net);
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}
}
			