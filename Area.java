import java.io.*;
class Area
{
	public static void main(String arg[])
	{
		try
		{
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr); 
			
			System.out.println("Square & Rectangle");
            System.out.println("------------------------");
            System.out.println("Enter the a value:");
			String s1 = br.readLine();
			int a = Integer.parseInt(s1);
			
            System.out.println("Enter the l value:");
            String s2 = br.readLine();
			int l = Integer.parseInt(s2);
			
			System.out.println("Enter the b value:");
            String s3 = br.readLine();
			int b = Integer.parseInt(s3);
			
			System.out.println("Result");
			
			int s = a*a;
			System.out.println("Area of Square:"+s);
			
			int p = 4*a;
			System.out.println("Perimeter of Square:"+p);
			
			int r = l*b;
			System.out.println("Area of Rectangle:"+r);
			
			int pr = 2*(l+b);
			System.out.println("Perimeter of Rectangle:"+pr);
		}
		catch(Exception e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}
}
			
			
			
		   